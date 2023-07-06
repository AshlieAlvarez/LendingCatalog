package com.lendingcatalog.model;

public class Member {
 //attributes
    private String firstName;
    private String lastName;
    private String itemsFilename;
//Constructor
    public Member(String firstName, String lastName, String itemsFilename) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.itemsFilename = itemsFilename;
    }

//Methods
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

//Getters & Setters
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

    public String getItemsFilename() {
        return itemsFilename;
    }

    public void setItemsFilename(String itemsFilename) {
        this.itemsFilename = itemsFilename;
    }
}

