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
        idm.createIdentity();
    }
}
