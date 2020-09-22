package com.example.demo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnTong,btnHieu,btnTich,btnThuong;
    private EditText edtSoA,edtSoB;
    private TextView txvKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTong = (Button) findViewById(R.id.btnTong);
        btnThuong = (Button) findViewById(R.id.btnThuong);
        btnHieu = (Button) findViewById(R.id.btnHieu);
        btnTich = (Button) findViewById(R.id.btnTich);
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        txvKetQua = (TextView) findViewById(R.id.txvKetQua);
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double soA = Double.parseDouble(edtSoA.getText()+"");
                double soB = Double.parseDouble(edtSoB.getText()+"");
                double tong = soA+soB;
                txvKetQua.setText(tong+"");
                Toast toast = Toast.makeText(getApplicationContext(),"Kết quả :"+tong,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double soA = Double.parseDouble(edtSoA.getText()+"");
                double soB = Double.parseDouble(edtSoB.getText()+"");
                double hieu = soA-soB;
                txvKetQua.setText(hieu+"");
                Toast toast = Toast.makeText(getApplicationContext(),"Hiệu :"+hieu,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double soA = Double.parseDouble(edtSoA.getText()+"");
                double soB = Double.parseDouble(edtSoB.getText()+"");
                double tich = soA*soB;
                txvKetQua.setText(tich+"");
                Toast toast = Toast.makeText(getApplicationContext(),"Kết quả :"+tich,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double soA = Double.parseDouble(edtSoA.getText()+"");
                double soB = Double.parseDouble(edtSoB.getText()+"");
                double thuong = soA/soB;
                txvKetQua.setText(thuong+"");
                Toast toast = Toast.makeText(getApplicationContext(),"Kết quả :"+thuong,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}