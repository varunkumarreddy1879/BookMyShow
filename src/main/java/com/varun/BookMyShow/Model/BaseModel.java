package com.varun.BookMyShow.Model;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;

import  java.util.Date;

@Data
@MappedSuperclass
public class BaseModel {

    @Id
    private Long Id;
    private Date lastUpdatedAt;
}
