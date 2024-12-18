package org.example;

public class Patron {
    private String name;
    private String id;
    private String email;
    private String phone;

    // Constructor to initialize Patron object.
    public Patron(String name, String id, String email, String phone) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    // Getter methods.
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    // Setters methods.
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}