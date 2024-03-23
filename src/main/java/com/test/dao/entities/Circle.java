package com.test.dao.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity(name = "circle")
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
public class Circle extends Shape{

    private String color;
}
