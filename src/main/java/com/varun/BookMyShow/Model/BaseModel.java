package com.varun.BookMyShow.Model;
import lombok.Data;

import  java.util.Date;

@Data
public class BaseModel {
    private Long Id;
    private Date lastUpdatedAt;
}
