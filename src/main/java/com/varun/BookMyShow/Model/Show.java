package com.varun.BookMyShow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;
@Data
@Entity(name = "show1")
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private  Auditorium auditorium;
    private Date startTime;
    private Date endTime;
    @Enumerated(EnumType.ORDINAL)
    private Language language;
}
