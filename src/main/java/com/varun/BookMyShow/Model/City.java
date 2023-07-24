package com.varun.BookMyShow.Model;
import lombok.Data;

import  java.util.*;
@Data
public class City extends BaseModel{
    private String name;
    private List<Theater> theaters;

}
