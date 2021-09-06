package org.example;

import static java.lang.Math.sqrt;
import static java.lang.String.format;

public class Triangle {
    public double area(int a, int b, int c) throws IllegalArgumentException {
        if (!validate(a, b, c)) {
            throw new IllegalArgumentException(format("Triangle with edges a=%d, b=%d, c=%d, doesn't exist", a, b, c));
        }

        double p = (a + b + c) / (double) 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private boolean validate(int a, int b, int c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
}
