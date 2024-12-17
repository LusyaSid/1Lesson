package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(surname, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(surname, numbers);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }
}

