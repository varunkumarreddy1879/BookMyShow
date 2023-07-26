package com.varun.BookMyShow.Dtos;

import com.varun.BookMyShow.Model.ResponceStatus;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class GetTicketResponseDto {
    private Long userId;
    private int amount;
    private List<Long> seatIds;
    private Long showId;
    private Date time;
    private ResponceStatus responceStatus;
    private String message;
}
