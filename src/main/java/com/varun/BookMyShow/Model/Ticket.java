package com.varun.BookMyShow.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@Entity
public class Ticket extends BaseModel{
    @ManyToOne
    private User user;
    private int amount;
    @ManyToMany
    private List<Seat> seats;
    @ManyToOne
    private Show show;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;
    private Date time;
}
