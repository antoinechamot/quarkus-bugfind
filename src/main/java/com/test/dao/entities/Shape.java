package com.test.dao.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder
@NoArgsConstructor
@Setter
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "shape")
public abstract class Shape {

    @Id
    @Builder.Default
    private UUID id = UUID.randomUUID();

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 100)
    private String surname;
}
