package com.varun.BookMyShow.Model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class User extends BaseModel{
    private String name;
    private String mail;
    private String mobile;
    private String password;

}
