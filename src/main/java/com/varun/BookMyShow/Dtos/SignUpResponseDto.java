package com.varun.BookMyShow.Dtos;

import com.varun.BookMyShow.Model.ResponceStatus;
import lombok.Data;

@Data
public class SignUpResponseDto {
    private String mail;
    private ResponceStatus responceStatus;
    private String reponseMessage;
}
