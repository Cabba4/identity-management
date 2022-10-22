package com.ar21.anmolarora;

public class Student implements Identity {
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

    
    public Student() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.email = "john.doe@hackermail.com";
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void displayEmail() {
        System.out.println("Email is is " + this.email);
    }

    public void displayName() {
        System.out.println("Name is " + this.firstName + this.lastName);
    }

    public void addDetails(){
        this.firstName = "newStudent";
        this.lastName = "lastName";
        this.email = "news.last@hackermail.com";
    }
}
