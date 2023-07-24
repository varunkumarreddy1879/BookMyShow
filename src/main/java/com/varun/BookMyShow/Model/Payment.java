package com.varun.BookMyShow.Model;

import lombok.Data;

import java.util.Date;
@Data
public class Payment extends BaseModel{
    private Long transactionReferenceId;
    private Ticket ticket;
    private User user;
    private Date time;
    private PaymentProvider paymentProvider;
    private PaymentStatus paymentStatus;

}
