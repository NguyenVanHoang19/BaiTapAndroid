package com.example.casestudy02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private EditText edtHoTen,edtNamSinh;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtHoTen = (EditText) findViewById(R.id.edtHoTen);
        edtNamSinh = (EditText) findViewById(R.id.edtNamSinh);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            //1900
            public void onClick(View view) {
                int tuoi = 0;
                try {
                    Calendar c = Calendar.getInstance();
                    int namHienTai =  c.get(Calendar.YEAR);
                    tuoi  =( namHienTai -  Integer.parseInt(edtNamSinh.getText() + ""));
                }catch (Exception ex){

                }
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Ten",new String(edtHoTen.getText().toString()));
                intent.putExtra("NamSinh",new String(edtNamSinh.getText().toString()));
                intent.putExtra("Tuoi",new String(tuoi +""));
                startActivity(intent);
            }
        });

    }
}