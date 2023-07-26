package com.varun.BookMyShow.Repository;

import com.varun.BookMyShow.Model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long> {

    public List<Seat> findAllByIdIn(List<Long> seatIds);

}
