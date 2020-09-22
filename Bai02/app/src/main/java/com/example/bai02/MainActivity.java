package com.example.bai02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {
    private Button btnDoC,btnDoF,btnClear;
    private EditText txtDoF,txtDoC;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        btnDoC = (Button)findViewById(R.id.btnDoC);
        btnDoF = (Button)findViewById(R.id.btnDoF);
        btnClear = (Button)findViewById(R.id.btnClear);
        txtDoC = (EditText)findViewById(R.id.txtDoC);
        txtDoF = (EditText) findViewById(R.id.txtDoF);
        btnDoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double doC = convertToCelsius(Integer.parseInt(txtDoF.getText()+""));
                    txtDoC.setText(doC+"");
                    Toast toast =Toast.makeText(getApplicationContext(),"Kêt quả"+ doC+"",Toast.LENGTH_SHORT);
                    toast.show();
                }catch (Exception ex){
                    Toast toast = Toast.makeText(getApplicationContext(),"Vui lòng nhập số!!!",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        btnDoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double doF = convertToFahrenheit(Integer.parseInt(txtDoC.getText()+""));
                    txtDoF.setText(doF+"");
                    Toast toast =Toast.makeText(getApplicationContext(),"Kêt quả"+ doF+"",Toast.LENGTH_SHORT);
                    toast.show();
                }catch (Exception ex){
                    Toast toast = Toast.makeText(getApplicationContext(),"Vui lòng nhập số!!!",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDoC.setText("");
                txtDoF.setText("");
            }
        });
    }
    private double convertToCelsius(double doF){
        return (doF - 32) * 5/9;
    }
    private double convertToFahrenheit(double doC){
        return doC * 9/5  + 32;
    }
}
