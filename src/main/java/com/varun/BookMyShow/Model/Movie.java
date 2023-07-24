package com.varun.BookMyShow.Model;

import lombok.Data;

import java.util.List;
@Data
public class Movie extends BaseModel{
    private String name;
    private List<Language> languages;
}
