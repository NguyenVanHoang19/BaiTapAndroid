package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnGui;
    private EditText edtMSSV,edtTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGui = (Button) findViewById(R.id.btnGui);
        edtTen = (EditText) findViewById(R.id.edtTen);
        edtMSSV = (EditText) findViewById(R.id.edtMSSV);
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("MSSV",new String(edtMSSV.getText().toString()));
                intent.putExtra("Ten",new String(edtTen.getText().toString()));
                startActivity(intent);
            }
        });


    }
}