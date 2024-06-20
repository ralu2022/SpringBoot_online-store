package com.example.flowershop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;

@Data
@SuperBuilder
public class Review {
    private int id;

    private String reviewMsg;
    private LocalDate date;

    private String userName;

    public Review() {

    }

}
