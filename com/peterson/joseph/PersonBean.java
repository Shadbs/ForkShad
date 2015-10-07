package com.peterson.joseph;

import java.io.Serializable;

/**
 * Created by Joseph on 10/7/2015.
 */
public class PersonBean implements Serializable {
    //These are private because once the user enters
    private String name;
    private String email;
//constructor makes it easier
    public PersonBean(String name, String email) {
        this.name = name;
        this.email = email;
    }
    //default constructor. We don't need defaults for person since every person is different.
    public PersonBean(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // private means dont mess with it.
}
