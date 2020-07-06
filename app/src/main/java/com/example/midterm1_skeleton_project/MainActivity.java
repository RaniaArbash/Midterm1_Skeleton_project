package com.example.midterm1_skeleton_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView myImage;
    Student myself;
    ArrayList<Student> studentArrayList;
    EditText myName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myImage = (ImageView) findViewById(R.id.personalImageID);
        myName = (EditText) findViewById(R.id.studentName);
        myself = new Student();
        studentArrayList = new ArrayList<Student>(0);
    }

    @Override
    protected void onResume() {
        super.onResume();
        myself = new Student();
    }

    public void uploade(View view) {

    }


    public void addYearandLevel(View view) {

    }



    public void saveStudent(View view) {
        Intent reportIntent = new Intent(this,ReportActivity.class);
        startActivity(reportIntent);

    }
}
