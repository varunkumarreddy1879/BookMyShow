package com.varun.BookMyShow.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Movie extends BaseModel{
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Language> languages;
}
