package com.example.searchablespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign Variable
        SearchableSpinner spinner = findViewById(R.id.spinner);

        ArrayList<String> numberList = new ArrayList<>();

        numberList.add("Monday");
        numberList.add("Tuesday");
        numberList.add("Wednesday");
        numberList.add("Thursday");
        numberList.add("Friday");
        numberList.add("Saturday");
        numberList.add("Sunday");

        spinner.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,numberList));
        spinner.setTitle("Search Aliza");



    }
}