package com.varun.BookMyShow.Model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class SeatType extends BaseModel{
    private  String name;
}
