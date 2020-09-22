package com.example.bai05;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnTinhTien,btnTiep,btnThongKe;
    private ImageButton btnExit;
    private CheckBox cboKhachHangVip;
    private EditText edtTenKhachHang,edtSoLuongSach;
    private TextView edtThanhTien,edtTongKhachHang,edtTongKhachHangVIP,edtTongDoanhThu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnExit = (ImageButton) findViewById(R.id.btnExit);
        btnTinhTien = (Button) findViewById(R.id.btnTinhThanhTien);
        btnTiep = (Button) findViewById(R.id.btnTiep);
        btnThongKe = (Button) findViewById(R.id.btnThongKe);
        cboKhachHangVip = (CheckBox) findViewById(R.id.cboKhachHangVIP);
        edtTenKhachHang = (EditText) findViewById(R.id.edtTenKhachHang);
        edtSoLuongSach = (EditText) findViewById(R.id.edtSoLuongSach);
        edtTongKhachHang = (TextView) findViewById(R.id.txvTongKhachHang);
        edtTongKhachHangVIP = (TextView) findViewById(R.id.txvTongKhachHangLaVip);
        edtTongDoanhThu = (TextView) findViewById(R.id.txvTongDoanhThu);
        edtThanhTien = (TextView) findViewById(R.id.txvThanhTien);

        final List<KhachHang> listKhachHang = new ArrayList<KhachHang>();
        btnTinhTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtTenKhachHang.getText().toString().equals("")){
                    try {

                        int soLuongSach = Integer.parseInt(edtSoLuongSach.getText()+"");
                        boolean khachVIP = cboKhachHangVip.isChecked();
                        double soTien = 0;
                        if(khachVIP){
                            soTien += (soLuongSach * 20000 ) - (soLuongSach * 20000 )*0.1;
                        }
                        else{
                            soTien += (soLuongSach * 20000 );
                        }
                        edtThanhTien.setText(soTien+"");
                    }catch (NumberFormatException ex ){
                        Toast toast = Toast.makeText(getApplicationContext(),"Số lượng sách không được bỏ trống!!!",Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(),"Tên khách hàng không được bỏ trống!!!",Toast.LENGTH_LONG);
                    toast.show();
                }


            }
        });
        btnTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String ten = edtTenKhachHang.getText()+"";
                    int soLuongSach = Integer.parseInt(edtSoLuongSach.getText()+"");
                    boolean khachVIP = cboKhachHangVip.isChecked();
                    double soTien = Double.parseDouble(edtThanhTien.getText()+"");
                    KhachHang khachHang = new KhachHang(ten,soLuongSach,khachVIP,soTien);
                    listKhachHang.add(khachHang);
                    edtTenKhachHang.setText("");
                    edtSoLuongSach.setText("");
                    edtTenKhachHang.requestFocus();
                }catch (NumberFormatException ex ){

                }

            }
        });
        btnThongKe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tongSoKhachHang = 0;
                int tongSoKhachHangVIP = 0;
                double tongDoanhThu = 0;
                for (KhachHang khachHang : listKhachHang){
                    tongSoKhachHang ++ ;
                    if (khachHang.isKhachHangVIP()){
                        tongSoKhachHangVIP ++;
                    }
                    tongDoanhThu += khachHang.getSoTien();
                }
                edtTongKhachHang.setText(tongSoKhachHang+"");
                edtTongKhachHangVIP.setText(tongSoKhachHangVIP+"");
                DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
                edtTongDoanhThu.setText(decimalFormat.format(tongDoanhThu)+" VNĐ");
            }
        });
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Bạn có chắc chắn thoát không?");
        builder.setMessage("Lựa chọn?");
        builder.setPositiveButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertDialog alertDialog = builder.create();
                alertDialog.dismiss();
            }
        });
        builder.setNegativeButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }

}