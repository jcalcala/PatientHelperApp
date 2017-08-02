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
import android.view.View.OnClickListener;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChartFragment extends Fragment implements OnClickListener{


    //define variables
    private Button checkChartsBtn;
    private Button checkVitalsBtn;
    private Button checkTreatmentBtn;

    public static ChartFragment newInstance() {
        ChartFragment chartFragment = new ChartFragment();
        return chartFragment;
    }

    public ChartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View chartView = inflater.inflate(R.layout.fragment_chart, container, false);

        //get reference to buttons in fragment_providers
        checkChartsBtn = (Button) chartView.findViewById(R.id.checkChartBtn);
        checkVitalsBtn = (Button) chartView.findViewById(R.id.checkVitalsBtn);
        checkTreatmentBtn = (Button) chartView.findViewById(R.id.checkTreatmentBtn);

        //sets the listeners
        checkChartsBtn.setOnClickListener(this);
        checkVitalsBtn.setOnClickListener(this);
        checkTreatmentBtn.setOnClickListener(this);

        //returns the view
        return chartView;
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity(), UnderConstructionActivity.class);
        startActivity(i);
    }
}
