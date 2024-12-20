package com.treizer;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    // Given - Dado
    private Example example;

    // It is initialized for each test
    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void testMethods() {
        int result = example.add(4, 4);
        // Evalute an expected and actual value
        Assertions.assertEquals(8, result);

        // Always expected a True
        // Assertions.assertTrue(result > 1);
        // Always expected a False
        // Assertions.assertFalse(result > 20);

        // Evaluate that the variable isn't null
        // Assertions.assertNotNull(result);

        // Evaluate the object type
        // Assertions.assertInstanceOf(Integer.class, result);

        // Evaluate Errors
        // Assertions.assertThrows(null, null);
    }

    @Test
    public void testAdd() {
        int numberA = 3;
        int numberB = 3;

        // When - Cuando
        int result = example.add(numberA, numberB);

        // Then - Entonces
        Assertions.assertNotNull(result);
        Assertions.assertEquals(6, result);
        Assertions.assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositive() {
        // Given
        int number = 4;

        // When
        boolean result = example.checkPositive(number);

        // Then
        Assertions.assertTrue(result);
        // Assertions.assertInstanceOf(Boolean.class, result);
    }

    @Test
    public void testCheckPositiveError() {
        // Given
        int number = -4;

        // Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositive(number);
        });
    }

    @Test
    public void testCountLettersA() {
        // Given
        String s = "unprogramadornace";

        // When
        int result = example.countLettersA(s);

        // Then
        Assertions.assertNotNull(result);
        Assertions.assertInstanceOf(Integer.class, result);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testContainElements() {
        // Given
        List<String> countries = List.of("Colombia", "México", "Perú");
        String country = "Colombia";

        // When
        boolean result = this.example.containElement(countries, country);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testRevertString() {
        // Given
        String s = "carro";

        // When
        String result = this.example.revertString(s);

        // Then
        Assertions.assertInstanceOf(String.class, result);
        Assertions.assertEquals("orrac", result);
    }

    @Test
    public void testFactorial() {
        // Given
        int number = 6;

        // When
        long result = this.example.factorial(number);

        // Then
        Assertions.assertNotNull(result);
        Assertions.assertInstanceOf(Long.class, result);
        Assertions.assertEquals(720, result);
    }

    @Test
    public void testFactorialError() {
        // Given
        int number = -6;

        // When - Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            this.example.factorial(number);
        });
    }

    @Test
    public void testIsPrime() {
        // Given
        int number = 3;

        // When
        boolean result = this.example.isPrime(number);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPrimeGreaterThanFour() {
        // Given
        int number = 7;

        // When
        boolean result = this.example.isPrime(number);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPrimeLessThanOne() {
        // Given
        int number = 1;

        // When
        boolean result = this.example.isPrime(number);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsNotPrime() {
        // Given
        int number = 9;

        // When
        boolean result = this.example.isPrime(number);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testDelayMessage() throws InterruptedException {
        // Given

        // When
        String result = this.example.delayMessage();

        // Then
        Assertions.assertEquals("Listo después de retraso", result);
    }

    @Test
    public void testConvertToString() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // When
        List<String> result = this.example.convertToString(numbers);

        // Then
        Assertions.assertEquals(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"), result);
    }

    @Test
    public void testCalculateMedia() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3);

        // When
        double result = this.example.calculateMedia(numbers);

        // Then
        Assertions.assertNotNull(result);
        Assertions.assertInstanceOf(Double.class, result);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testCalculateMediaWhenNull() {
        // Given
        List<Integer> numbers = null;

        // When - Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            this.example.calculateMedia(numbers);
        });
    }

    @Test
    public void testCalculateMediaWhenEmpty() {
        // Given
        List<Integer> numbers = Collections.emptyList();

        // When - Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            this.example.calculateMedia(numbers);
        });
    }

    @Test
    public void testConvertListStringToUpperCase() {
        // Given
        List<String> letters = List.of("a", "b", "c", "d", "e");

        // When
        String result = this.example.convertListStringToUpperCase(letters);

        // Then
        System.out.println(result);
        Assertions.assertEquals("A, B, C, D, E", result);
    }

}
