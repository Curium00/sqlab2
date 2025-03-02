package com.ontariotechu.sofe3980U;

public class Binary {
    private String value;

    public Binary(String value) {
        if (!value.matches("[01]+")) {
            throw new IllegalArgumentException("Binary number must contain only 0s and 1s");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Binary add(Binary a, Binary b) {
        int sum = Integer.parseInt(a.value, 2) + Integer.parseInt(b.value, 2);
        return new Binary(Integer.toBinaryString(sum));
    }

    // New Multiplication Method
    public static Binary multiply(Binary a, Binary b) {
        int product = Integer.parseInt(a.value, 2) * Integer.parseInt(b.value, 2);
        return new Binary(Integer.toBinaryString(product));
    }

    // New AND Operation
    public static Binary and(Binary a, Binary b) {
        int andResult = Integer.parseInt(a.value, 2) & Integer.parseInt(b.value, 2);
        return new Binary(Integer.toBinaryString(andResult));
    }

    // New OR Operation
    public static Binary or(Binary a, Binary b) {
        int orResult = Integer.parseInt(a.value, 2) | Integer.parseInt(b.value, 2);
        return new Binary(Integer.toBinaryString(orResult));
    }
}
