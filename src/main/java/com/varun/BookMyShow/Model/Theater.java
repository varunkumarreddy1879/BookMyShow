package com.varun.BookMyShow.Model;
import lombok.Data;

import  java.util.*;
@Data
public class Theater extends BaseModel{
    private String name;
    private List<Auditorium> auditoriums;
    private String address;
    private City city;
}
