package com.varun.BookMyShow.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import  java.util.*;
@Data
@Entity
public class Theater extends BaseModel{
    private String name;
    @OneToMany
    private List<Auditorium> auditoriums;
    private String address;
    @ManyToOne
    private City city;
}
