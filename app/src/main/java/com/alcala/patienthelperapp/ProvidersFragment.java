/*
 * Copyright (c) 2017. All Rights Reserved.
 */

package com.alcala.patienthelperapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProvidersFragment extends Fragment implements OnClickListener {

    //define variables
    private Button addProviderBtn;
    private Button deleteProviderBtn;
    private Button searchProviderBtn;

    public static ProvidersFragment newInstance() {
        ProvidersFragment providersFragment = new ProvidersFragment();
        return providersFragment;
    }

    public ProvidersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View providersView = inflater.inflate(R.layout.fragment_providers, container, false);

        //get reference to buttons in fragment_providers
        addProviderBtn = (Button) providersView.findViewById(R.id.addProviderBtn);
        deleteProviderBtn = (Button) providersView.findViewById(R.id.deleteProviderBtn);
        searchProviderBtn = (Button) providersView.findViewById(R.id.searchProviderBtn);

        //sets the listeners
        addProviderBtn.setOnClickListener(this);
        deleteProviderBtn.setOnClickListener(this);
        searchProviderBtn.setOnClickListener(this);

        //returns the view
        return providersView;
    }

    //action being done when buttons are used
    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity(), UnderConstructionActivity.class);
        startActivity(i);
    }
}
