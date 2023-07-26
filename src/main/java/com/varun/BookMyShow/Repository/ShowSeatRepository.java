package com.varun.BookMyShow.Repository;

import com.varun.BookMyShow.Model.Seat;
import com.varun.BookMyShow.Model.Show;
import com.varun.BookMyShow.Model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long> {
    List<ShowSeat> findAllBySeatInandShow(List<Seat> seats, Show show);

    ShowSeat save(ShowSeat showSeat);
}
