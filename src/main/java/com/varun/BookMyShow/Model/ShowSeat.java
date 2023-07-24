package com.varun.BookMyShow.Model;

import lombok.Data;

@Data
public class ShowSeat extends BaseModel{
    private Show show;
    private Seat seat;

    private SeatStatus seatStatus;
}
