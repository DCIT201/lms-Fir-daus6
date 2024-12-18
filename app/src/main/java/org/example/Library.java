package org.example;

import java.util.Arrays;

// Constructor to initialize Library object.
public class Library {
    private String name;
    private String address;
    private String operatingHours;
    private String[] books;
    public String[] patrons;
    public Library(String name, String address, String operatingHours) {
        this.name = name;
        this.address = address;
        this.operatingHours = operatingHours;

    }

    // Getters and Setters methods.
    public void setBooks(String[] books) {
        this.books = books;
    }
    public void setPatrons(String[] patrons) {
        this.patrons = patrons;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getOperatingHours() {
        return operatingHours;
    }
    public String[] getBooks() {
        return books;
    }
    public String[] getPatrons() {
        return patrons;
    }

    // Methods to display Library objects.
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Operating Hours: " + operatingHours);
        System.out.println("Books: " + Arrays.toString(books));
        System.out.println("Patrons: " + Arrays.toString(patrons));

    }
}


