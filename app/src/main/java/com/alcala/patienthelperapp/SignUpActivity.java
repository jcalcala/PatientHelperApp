/*
 * Copyright (c) 2017. All Rights Reserved.
 */

package com.alcala.patienthelperapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.alcala.patienthelperapp.data.PatientInfo;

public class SignUpActivity extends AppCompatActivity {

    //UI variables
    private EditText firstNameET, lastNameET, emailET, passwordET;

    //database handler
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        dbHandler = new MyDBHandler(this);

        firstNameET = (EditText) findViewById(R.id.firstNameET);
        lastNameET = (EditText) findViewById(R.id.lastNameET);
        emailET = (EditText) findViewById(R.id.emailET);
        passwordET = (EditText) findViewById(R.id.password);

        firstNameET.requestFocus();
    }

    public void addPatientBtn(View view) {
        PatientInfo patientInfo = new PatientInfo(firstNameET.getText().toString(),
                lastNameET.getText().toString(), emailET.getText().toString(),
                passwordET.getText().toString());
        dbHandler.addPatient(patientInfo);
        Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(i);
    }

    public void cancelBtn(View view) {
        Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(i);
    }
}
