package com.example.test;

import com.example.model.Address;
import com.example.model.Person;

/**
 * Klasa testująca.
 */
public class Test {
    public static void main(String[] args) {
        // Testowanie klasy Person
        Person person = new Person("Jane", "Smith", 25);
        System.out.println("Person: " + person);

        // Testowanie klasy Address
        Address address = new Address("456 Oak Street", "Townsville", "67890");
        System.out.println("Address: " + address);
    }
}
