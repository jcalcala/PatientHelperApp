/*
 * Copyright (c) 2017. All Rights Reserved.
 */

package com.alcala.patienthelperapp.data;

/**
 * Created by Admin on 7/23/2017.
 */

public class PatientInfo {

    private String firstName;
    private String lastName;
    private String email;
    private int _id;
    private String password;

    public PatientInfo() {

    }

    public PatientInfo(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

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

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
