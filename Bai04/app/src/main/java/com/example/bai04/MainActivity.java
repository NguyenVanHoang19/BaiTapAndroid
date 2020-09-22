package com.example.bai04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnGuiThongTin;
    private EditText edtHoTen,edtCMND,edtThongTinBoSung;
    private RadioGroup radGBangCap;
    private RadioButton radTrungCap,radCaoDang,radDaiHoc;
    private CheckBox cboDocBao,cboDocSach,cboDocCoding;
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        btnGuiThongTin = (Button) findViewById(R.id.btnGuiThongTin);
        edtHoTen =(EditText) findViewById(R.id.edtHoTen);
        edtThongTinBoSung =(EditText) findViewById(R.id.edtThongTinBoSung);
        edtCMND = (EditText) findViewById(R.id.edtCMND);
        radGBangCap = (RadioGroup) findViewById(R.id.radBangCap);
        radTrungCap = (RadioButton) findViewById(R.id.radTrungCap);
        radCaoDang =(RadioButton) findViewById(R.id.radCaoDang);
        radDaiHoc =(RadioButton) findViewById(R.id.radDaiHoc);
        cboDocBao = (CheckBox) findViewById(R.id.cboDocBao);
        cboDocSach =(CheckBox) findViewById(R.id.cboDocSach);
        cboDocCoding = (CheckBox) findViewById(R.id.cboDocCoding);

        btnGuiThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String regexHoTen = "[a-zA-Z]{3,}";
                String hoTen = edtHoTen.getText() +"";
                String regexCMND = "[0-9]{9}";
                String cmStr = edtCMND.getText()+"";
                if(!hoTen.matches(regexHoTen)){
                    Toast toast = Toast.makeText(getApplicationContext(),"Họ tên phải có ít nhât 3 kí tự và không chứa số",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if(!cmStr.matches(regexCMND)){
                    Toast toast = Toast.makeText(getApplicationContext(),"CMND phải có 9 số",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if(!radCaoDang.isChecked() && !radTrungCap.isChecked() && !radDaiHoc.isChecked()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Phải chọn bằng cấp",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if(!cboDocBao.isChecked() && !cboDocSach.isChecked() && !cboDocCoding.isChecked()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Phải chọn ít nhất 1 sở thích",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(),"Thông tin đã được gửi!!!",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }


}
