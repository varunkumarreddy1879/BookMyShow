package com.varun.BookMyShow.Model;

import lombok.Data;

import java.util.Date;
@Data
public class Show extends BaseModel{
    private Movie movie;
    private  Auditorium auditorium;
    private Date startTime;
    private Date endTime;
    private Language language;
}
