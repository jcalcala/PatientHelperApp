/*
 * Copyright (c) 2017. All Rights Reserved.
 */

package com.alcala.patienthelperapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class AppointmentsFragment extends Fragment implements OnClickListener{

    //define variables
    private Button checkAppointmentsBtn;
    private Button makeAppointmentsBtn;
    private Button cancelAppoitmentBtn;

    public static AppointmentsFragment newInstance() {
        AppointmentsFragment appointmentsFragment = new AppointmentsFragment();
        return appointmentsFragment;
    }

    public AppointmentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View appointmentsView = inflater.inflate(R.layout.fragment_appointments, container, false);

        //get reference to buttons in fragment_providers
        checkAppointmentsBtn = (Button) appointmentsView.findViewById(R.id.checkAppointmentBtn);
        makeAppointmentsBtn = (Button) appointmentsView.findViewById(R.id.makeAppointmentBtn);
        cancelAppoitmentBtn = (Button) appointmentsView.findViewById(R.id.cancelAppointments);

        //sets the listeners
        checkAppointmentsBtn.setOnClickListener(this);
        makeAppointmentsBtn.setOnClickListener(this);
        cancelAppoitmentBtn.setOnClickListener(this);

        //returns the view
        return appointmentsView;
    }

    //action being done when buttons are used
    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity(), UnderConstructionActivity.class);
        startActivity(i);
    }
}
