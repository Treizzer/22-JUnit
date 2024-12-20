package com.treizer;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

    // 1. Method to addition two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Method that throw an exception
    public boolean checkPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return true;
    }

    // 3. Method to find a number of letters 'a'
    public int countLettersA(String letter) {
        return (int) letter.chars()
                .filter(l -> l == 'a')
                .count();
    }

    // 4. Method that return a boolean value if the list contains
    public boolean containElement(List<String> list, String element) {
        return list.contains(element);
    }

    // 5. Method to reverse a string
    public String revertString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // 6. Method that calculate factorial of a number
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial no definido para números negativos");
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    // 7. Method to verify whether a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 8. Method that simulate a delay and return a message
    public String delayMessage() throws InterruptedException {
        Thread.sleep(5000);
        return "Listo después de retraso";
    }

    // Method to convert a list of Integer to a list of Strings
    public List<String> convertToString(List<Integer> list) {
        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    // 10. Method that calculate media from a list of Integers
    public double calculateMedia(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }

    // 11. Method to convert a list of String to upper case
    public String convertListStringToUpperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
    }

}
