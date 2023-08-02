package com.varun.BookMyShow.Repository;

import com.varun.BookMyShow.Model.Seat;
import com.varun.BookMyShow.Model.Show;
import com.varun.BookMyShow.Model.ShowSeat;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    List<ShowSeat> findAllBySeatAndShowIn(Show show,List<Seat> seats);

    ShowSeat save(ShowSeat showSeat);
}
