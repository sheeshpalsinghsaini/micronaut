package com.learn.dto.model;

import jakarta.inject.Singleton;
import lombok.Data;

@Data
@Singleton
public class Student {
    private String name;
    private Integer rollNo;
}
