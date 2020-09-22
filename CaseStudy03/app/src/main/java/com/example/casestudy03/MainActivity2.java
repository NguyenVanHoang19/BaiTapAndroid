package com.example.casestudy03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    private EditText edtHoTen,edtNamSinh;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edtHoTen = (EditText) findViewById(R.id.edtHoTen);
        edtNamSinh = (EditText) findViewById(R.id.edtNamSinh);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tuoi = 0;
                try {
                    Calendar c = Calendar.getInstance();
                    int namHienTai =  c.get(Calendar.YEAR);
                    tuoi  =( namHienTai -  Integer.parseInt(edtNamSinh.getText() + ""));
                }catch (Exception ex){

                }
                Intent travel = new Intent();
                travel.putExtra("Ten",edtHoTen.getText().toString());
                travel.putExtra("NamSinh",edtNamSinh.getText().toString());
                travel.putExtra("Tuoi",tuoi +"");
                setResult(RESULT_OK,travel);
                finish();
            }
        });
    }
}