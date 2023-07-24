package com.varun.BookMyShow.Model;

import lombok.Data;

import java.util.List;

@Data
public class Auditorium extends BaseModel{
    private String name;
    private List<Seat> seats;
    private Show currentShow;
    private List<Feature> features;
}
