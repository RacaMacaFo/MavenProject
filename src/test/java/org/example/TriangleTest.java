package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle target;

    @BeforeEach
    void setUp() {
        target = new Triangle();

    }

    @Test
    @DisplayName("When triangle is valid Then a correct area is calculated")
    void area_success() {
        // given
        int a = 2;
        int b = 3;
        int c = 4;

        // when
        double actual = target.area(a, b, c);

        // then
        assertEquals(2.9047375096555625, actual);
    }

    @Test
    @DisplayName("When triangle doesn't exist Then an error is thrown")
    void area_doesNotExist() {
        // given
        int a = 1;
        int b = 2;
        int c = 5;

        // when
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
            target.area(a, b, c);
        });

        // then
        String expected = format("Triangle with edges a=%d, b=%d, c=%d, doesn't exist", a, b, c);
        assertEquals(expected, actual.getMessage());
    }
}