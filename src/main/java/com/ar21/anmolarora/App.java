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
        IDMService idm = new IDMService();
        idm.createIdentity(new Student("Ethan","Blake","ethan.blake@hackermail.com"));
        Student newStudent = new Student();
        idm.getIdentity(newStudent);
        Teacher newTeacher = new Teacher();
        idm.getIdentity(newTeacher);
        newTeacher.addDetails();
        newTeacher.displayName();
    }
}
