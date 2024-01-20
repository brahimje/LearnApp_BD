package com.example.learnapp_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    GridView gridView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        gridView = findViewById(R.id.gridView);

        // Sample data for modules
        String[] modules = {"Module 1", "Module 2", "Module 3", "Module 4", "Module 5"};

        // Adapter for the GridView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.module_item
                ,R.id.moduleNameTextView, modules);
        gridView.setAdapter(adapter);
    }
}