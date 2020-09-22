package com.example.casestudy03;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewKetQua;
    private Button btnThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewKetQua = (TextView) findViewById(R.id.textViewKetQua);
        btnThongTin = (Button) findViewById(R.id.btnThongTin);

        btnThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivityForResult(intent,999);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 999 && resultCode == RESULT_OK){
            textViewKetQua.setText("Tên: "+data.getStringExtra("Ten")+"\n"+"Năm Sinh: " +data.getStringExtra("NamSinh")+"\n"+"Tuổi: "+data.getStringExtra("Tuoi")+"\n");
        }
    }


}