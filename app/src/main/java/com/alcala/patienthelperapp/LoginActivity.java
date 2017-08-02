/*
 * Copyright (c) 2017. All Rights Reserved.
 */

package com.alcala.patienthelperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    //define UI variables
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private PopupWindow myPopUp;
    private LinearLayout positionOfPopUp;
    private String email;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Set up the login form.
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        mPasswordView = (EditText) findViewById(R.id.password);
        positionOfPopUp = (LinearLayout) findViewById(R.id.popUp_position);

        final Button mEmailSignInButton = (Button) findViewById(R.id.email_sign_in_button);
        mEmailSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                email = mEmailView.getText().toString();
                password = mPasswordView.getText().toString();
                if(email.contains("@") && password.equals("123")) {
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                    //Toast.makeText(LoginActivity.this, "You are logged in.", Toast.LENGTH_LONG).show();
                }
                else {
                    LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                    View customView = inflater.inflate(R.layout.popup_layout, null);

                    myPopUp = new PopupWindow(customView, RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);

                    Button signUpBtn = (Button) customView.findViewById(R.id.signUpBtn);
                    signUpBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
                            startActivity(i);
                        }
                    });

                    Button cancelSignUpBtn = (Button) customView.findViewById(R.id.cancelSignUpBtn);
                    cancelSignUpBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            myPopUp.dismiss();
                        }
                    });
                    //Toast.makeText(LoginActivity.this, "Incorrect email or password", Toast.LENGTH_LONG).show();
                    myPopUp.showAtLocation(positionOfPopUp, Gravity.CENTER, 0, 0);
                }
            }
        });
    }
}
