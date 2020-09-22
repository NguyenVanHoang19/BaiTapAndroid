package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textViewMSSV,textViewTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewMSSV = (TextView) findViewById(R.id.textViewMSSV);
        textViewTen = (TextView) findViewById(R.id.textViewTen);
        textViewMSSV.setText(getIntent().getExtras().getString("MSSV"));
        textViewTen.setText(getIntent().getExtras().getString("Ten"));
    }
}