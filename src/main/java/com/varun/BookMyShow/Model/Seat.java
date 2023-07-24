package com.varun.BookMyShow.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="Seat1")
public class Seat extends BaseModel{
    @Column(name = "rownumber")
    private int row;
    @Column(name = "colnumber")
    private int col;
    private String seatNumber;
    @ManyToOne
    private SeatType seatType;
}
