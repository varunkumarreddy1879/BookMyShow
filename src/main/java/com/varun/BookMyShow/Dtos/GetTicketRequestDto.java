package com.varun.BookMyShow.Dtos;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class GetTicketRequestDto {
    private Long userId;
    private List<Long> seatIds;
    private Long showId;
}
