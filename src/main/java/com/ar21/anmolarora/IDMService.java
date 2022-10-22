package com.ar21.anmolarora;

public class IDMService {

    public void createIdentity(Identity idm) {
        idm.addDetails();
    }

    public void getIdentity(Identity idm) {
        idm.displayEmail();
        idm.displayName();
    }

    public void modifyIdentity(){

    }
}
