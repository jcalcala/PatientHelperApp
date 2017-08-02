/*
 * Copyright (c) 2017. All Rights Reserved.
 */

package com.alcala.patienthelperapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.alcala.patienthelperapp.data.PatientInfo;

/**
 * Created by Admin on 7/23/2017.
 */

public class MyDBHandler extends SQLiteOpenHelper{

    //define DB variables
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "patients.db";
    public static final String TABLE_NAME = "patients";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_FIRSTNAME = "firstname";
    public static final String COLUMN_LASTNAME = "lastname";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASSWORD = "password";

    //define SQLite DB variable
    private SQLiteDatabase database;

    public MyDBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //this method will create the table
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "+TABLE_NAME+"("+
                COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                COLUMN_FIRSTNAME+" TEXT NOT NULL, "+
                COLUMN_LASTNAME+" TEXT NOT NULL, "+
                COLUMN_EMAIL+" EMAIL NOT NULL, "+
                COLUMN_PASSWORD+" TEXT NOT NULL);";
        db.execSQL(query);
    }

    //this method will update the existing table
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public MyDBHandler open() throws SQLException {
        database = getWritableDatabase();
        return this;
    }

    //add new patient
    public void addPatient(PatientInfo patientInfo) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_FIRSTNAME, patientInfo.getFirstName());
        values.put(COLUMN_LASTNAME, patientInfo.getLastName());
        values.put(COLUMN_EMAIL, patientInfo.getEmail());
        values.put(COLUMN_PASSWORD, patientInfo.getPassword());

        open();
        database.insert(TABLE_NAME, null, values);
        close();
    }
}
