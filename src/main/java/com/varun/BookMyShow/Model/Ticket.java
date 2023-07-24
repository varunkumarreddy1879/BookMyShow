package com.varun.BookMyShow.Model;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class Ticket extends BaseModel{
    private User user;
    private int amount;
    private List<Seat> seats;
    private Show show;
    private List<Payment> payments;
    private TicketStatus ticketStatus;
    private Date time;
}
