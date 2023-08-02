package com.varun.BookMyShow.Controller;

import com.varun.BookMyShow.Dtos.GetTicketRequestDto;
import com.varun.BookMyShow.Dtos.GetTicketResponseDto;
import com.varun.BookMyShow.Exceptions.InvalidArgumentException;
import com.varun.BookMyShow.Model.ResponceStatus;
import com.varun.BookMyShow.Model.Ticket;
import com.varun.BookMyShow.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired
    TicketController(TicketService ticketService){
        this.ticketService=ticketService;
    }

    public GetTicketResponseDto getTicket(GetTicketRequestDto request){

        Long userId=request.getUserId();
        List<Long> seatIds=request.getSeatIds();
        Long showId=request.getShowId();

        Ticket ticket;
        GetTicketResponseDto response=new GetTicketResponseDto();

        try{
            ticket=ticketService.getTicket(userId,seatIds,showId);
        }
        catch (Exception e){
            response.setResponceStatus(ResponceStatus.FAILED);
            response.setMessage("Something Went Wrong.");
            return response;
        }

        response.setAmount(ticket.getAmount());
        response.setTime(ticket.getTime());
        response.setSeatIds(seatIds);
        response.setShowId(showId);
        response.setUserId(userId);

        response.setResponceStatus(ResponceStatus.SUCCESS);

        return response;
    }

}
