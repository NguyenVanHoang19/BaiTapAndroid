package com.example.phngtrnhbc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnTinh;
    private EditText edtSoA,edtSoB,edtSoC;
    private TextView txvKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTinh = (Button) findViewById(R.id.btnTinh);
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        edtSoC = (EditText) findViewById(R.id.edtSoC);
        txvKetQua = (TextView) findViewById(R.id.txvNghiem);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double a =  Double.parseDouble(edtSoA.getText()+"");
                    double b = Double.parseDouble(edtSoB.getText()+"");
               //
                    if(edtSoC.getText().toString().equals("")) {
                       PhuongTrinhBacNhat phuongTrinhBacNhat = new PhuongTrinhBacNhat(a,b);
                        txvKetQua.setText(phuongTrinhBacNhat.nghiem());
                    }else{
                        double c = Double.parseDouble(edtSoC.getText()+"");
                        PhuongTrinhBacHai phuongTrinhBacHai = new PhuongTrinhBacHai(a, b, c);
                        txvKetQua.setText(phuongTrinhBacHai.nghiem());

                    }
                }catch (Exception ex){
                    Toast toast = Toast.makeText(getApplicationContext(),"Khong duoc bo trong!!!",Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }

    }