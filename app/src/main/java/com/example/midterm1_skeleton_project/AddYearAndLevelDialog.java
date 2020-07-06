package com.example.midterm1_skeleton_project;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;


public class AddYearAndLevelDialog extends DialogFragment  {

    EditText text;
    NumberPicker year_picker;
    // modelT;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.add_year_level,container,false);

       return view;
    }

}
