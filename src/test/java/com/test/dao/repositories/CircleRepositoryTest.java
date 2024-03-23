package com.test.dao.repositories;

import com.test.dao.entities.Circle;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test to update Circle with a detached entity
 */
@QuarkusTest
class CircleRepositoryTest {



    @Inject
    CircleRepository repository;


    /**
     * Update circle color from red to blue : OK
     */
    @Test
    void testUpdateCircleColorBlue_OK(){
        Circle myCircle = Circle.builder()
                .id(UUID.fromString("968e6a71-d7e4-4913-bba9-8b93641cf5e5"))
                .name("My circle")
                .surname("My surname")
                .color("blue")
                .build();

         repository.update(myCircle);

        Circle updatedCircle = repository.findById(UUID.fromString("968e6a71-d7e4-4913-bba9-8b93641cf5e5"));
        assertThat(updatedCircle.getColor()).isEqualTo("blue");

    }


    /**
     * Update Circle surname to null : OK
     */
    @Test
    void testUpdateCircleSurnameNull_OK(){
        Circle myCircle = Circle.builder()
                .id(UUID.fromString("3c44daf8-17d1-451d-8af1-43c18ed936db"))
                .name("My circle")
                .surname(null)
                .color("red")
                .build();

        repository.update(myCircle);
        Circle updatedCircle = repository.findById(UUID.fromString("3c44daf8-17d1-451d-8af1-43c18ed936db"));
        assertThat(updatedCircle.getSurname()).isNull();

    }

    /**
     * Update Circle color to null : KO
     */
    @Test
    void testUpdateCircleColorNullKO(){
        Circle myCircle = Circle.builder()
                .id(UUID.fromString("847dae35-7ae0-4041-8257-e23fb7c5b033"))
                .name("My circle")
                .surname("My surname")
                .color(null)
                .build();

        repository.update(myCircle);

        Circle updatedCircle = repository.findById(UUID.fromString("847dae35-7ae0-4041-8257-e23fb7c5b033"));

        assertThat(updatedCircle.getColor()).isNull();

    }
}
