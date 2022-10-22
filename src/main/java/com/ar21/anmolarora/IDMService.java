package com.ar21.anmolarora;

public class IDMService {

    public void createIdentity() {
        Student newStudent = new Student();
        newStudent.setFirstName("User1");
        newStudent.setLastName("lastname");
        newStudent.setEmail("user1.lastname@gmail.com");
        newStudent.displayEmail();
        newStudent.displayName();
    }

    public void getIdentity() {

    }

    public void modifyIdentity(){

    }
}
