package com.varun.BookMyShow.Model;

import lombok.Data;

@Data
public class User extends BaseModel{
    private String name;
    private String mail;
    private String mobile;
    private String password;

}
