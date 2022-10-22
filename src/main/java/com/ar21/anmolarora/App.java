package com.ar21.anmolarora;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //IDMfunction();
        ContactService();
    }

    public static void IDMfunction(){
        IDMService idm = new IDMService();
        idm.createIdentity(new Student("Ethan","Blake","ethan.blake@hackermail.com"));
        Student newStudent = new Student();
        idm.getIdentity(newStudent);
        Teacher newTeacher = new Teacher();
        idm.getIdentity(newTeacher);
        newTeacher.addDetails();
        newTeacher.displayName();
    }

    public static void ContactService(){
        ContactService contactService = new ContactService();
        CustomerContact another = new CustomerContact("user1", "user@mail.com", 1121);
        contactService.addContact(another);
        contactService.findContact(another);
    }
}
