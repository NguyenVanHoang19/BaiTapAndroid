package com.example.casestudy02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textViewKetQua;
    private Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewKetQua = (TextView) findViewById(R.id.textViewKetQua);
        btnExit = (Button) findViewById(R.id.btnExit);
        textViewKetQua.setText("Tên: "+getIntent().getExtras().getString("Ten")+"\n"+"Năm Sinh: " +getIntent().getExtras().getString("NamSinh")+"\n"+"Tuổi: "+getIntent().getExtras().getString("Tuoi")+"\n");
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}