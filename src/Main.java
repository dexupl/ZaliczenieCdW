package com.example;

import com.example.model.Address;
import com.example.model.Person;

/**
 * Klasa główna.
 */
public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Person
        Person person = new Person("John", "Doe", 30);

        // Tworzenie obiektu klasy Address
        Address address = new Address("123 Main Street", "Cityville", "12345");

        // Wyświetlanie informacji o osobie i adresie
        System.out.println("Person: " + person);
        System.out.println("Address: " + address);
    }
}
