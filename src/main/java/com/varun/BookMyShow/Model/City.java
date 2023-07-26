package com.varun.BookMyShow.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import  java.util.*;
@Data
@Entity
public class City extends BaseModel{
    private String name;

    @OneToMany(mappedBy = "city")
    private List<Theater> theaters;

}
