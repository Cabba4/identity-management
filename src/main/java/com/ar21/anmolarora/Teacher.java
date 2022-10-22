package com.ar21.anmolarora;

public class Teacher implements Identity {
    String firstName, lastName, email;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Teacher() {
        this.firstName = "Walter";
        this.lastName = "White";
        this.email = "walter.white@hackmail.com";
    }

    public void displayEmail() {
        System.out.println("Email is is " + this.email);
    }

    public void displayName() {
        System.out.println("Name is " + this.firstName + this.lastName);
    }
}
