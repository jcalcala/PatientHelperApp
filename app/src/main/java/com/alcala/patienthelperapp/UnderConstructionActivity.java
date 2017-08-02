/*
 * Copyright (c) 2017. All Rights Reserved.
 */

package com.alcala.patienthelperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UnderConstructionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_construction);
    }

    public void signOutBtn(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    public void homeBtn(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
