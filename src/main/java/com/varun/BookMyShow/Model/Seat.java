package com.varun.BookMyShow.Model;

import lombok.Data;

@Data
public class Seat extends BaseModel{
    private int row;
    private int col;
    private String seatNumber;
    private SeatType seatType;
}
