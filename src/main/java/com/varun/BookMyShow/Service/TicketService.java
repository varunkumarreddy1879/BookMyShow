package com.varun.BookMyShow.Service;

import com.varun.BookMyShow.Exceptions.InvalidArgumentException;
import com.varun.BookMyShow.Model.*;
import com.varun.BookMyShow.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.Date;

@Service
public class TicketService {

    UserRepository userRepository;
    ShowRepository showRepository;
    SeatRepository seatRepository;
    ShowSeatRepository showSeatRepository;
    TicketRepository ticketRepository;

    @Autowired
    TicketService(TicketRepository ticketRepository,UserRepository userRepository,ShowRepository showRepository,SeatRepository seatRepository,ShowSeatRepository showSeatRepository){
        this.userRepository=userRepository;
        this.showRepository=showRepository;
        this.seatRepository=seatRepository;
        this.showSeatRepository=showSeatRepository;
        this.ticketRepository=ticketRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket getTicket(Long userId, List<Long> seatIds, Long showId) throws InvalidArgumentException {
        /*

        1.getUser
           1.a user unavailable - throw exception
        2.getListOfSeats
        3.getShow
           if show id not available throw exception
        4.check seats availability
        5.if any seat is unavailable - throw excetion
        6.block the seats
        7.generate ticket

         */

        // get user
        Optional<User> optionalUser=userRepository.findById(userId);

        if(optionalUser.isEmpty()){
            throw new InvalidArgumentException("User with id : "+userId+" does not exist.");
        }

        User user=optionalUser.get();

        //get show
        Optional<Show> optionalShow=showRepository.findById(showId);

        if(optionalShow.isEmpty()){
            throw new InvalidArgumentException("Show with id : "+showId+" does not exist.");
        }

        Show show=optionalShow.get();

        // get list<Seat>
        List<Seat> seats=seatRepository.findAllByIdIn(seatIds);
        //lock the showseats by using @Lock over query
        List<ShowSeat> showSeats=showSeatRepository.findAllBySeatAndShowIn(show,seats);

        for(ShowSeat showSeat:showSeats){
            if(showSeat.getShowSeatStatus().equals(ShowSeatStatus.BOOKED)
                    || (showSeat.getShowSeatStatus().equals(ShowSeatStatus.BLOCKED) &&
                    ( new Date().getTime() - showSeat.getLastModifiedAt().getTime() > 15*60*1000)))
            {
                throw new InvalidArgumentException("Something Went Wrong.");
            }
        }

        for(ShowSeat showSeat:showSeats){
            showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKED);
            showSeat.setLockedAt(new Date());
            showSeat=showSeatRepository.save(showSeat);
        }

        Ticket ticket=new Ticket();
        ticket.setTicketStatus(TicketStatus.SUCCESS);
        ticket.setTime(new Date());
        ticket.setShow(show);
        ticket.setSeats(seats);
        ticket.setAmount(0);
        ticket.setUser(user);

        ticketRepository.save(ticket);
        return ticket;
    }
}
