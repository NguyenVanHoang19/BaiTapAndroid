package com.example.phngtrnhbtnht;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnTinh;
    private EditText edtSoA,edtSoB;
    private TextView txvKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTinh = (Button) findViewById(R.id.btnTinh);
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        txvKetQua = (TextView) findViewById(R.id.txvNghiem);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a =  Double.parseDouble(edtSoA.getText()+"");
                double b = Double.parseDouble(edtSoB.getText()+"");
                PhuongTrinhBacNhat phuongTrinhBacNhat = new PhuongTrinhBacNhat(a,b);
                txvKetQua.setText(phuongTrinhBacNhat.nghiem());
            }
        });
    }

}