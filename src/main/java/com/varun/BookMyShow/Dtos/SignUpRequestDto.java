package com.varun.BookMyShow.Dtos;

import lombok.Data;

@Data
public class SignUpRequestDto {
    private String name;
    private String mail;
    private String phone;
    private String password;
}
