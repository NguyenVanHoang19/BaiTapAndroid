package com.example.demotoast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AlertDialog.Builder myDialog = new AlertDialog.Builder(this);
        myDialog.setTitle("Message");
        textViewKetQua = (TextView) findViewById(R.id.textViewKetQua);
//        myDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                textViewKetQua.setText("You choice yes");
//            }
//        });
        final  CharSequence[] items =  {"Đỏ","Vàng","Cam"};
//        myDialog.setItems(items, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                textViewKetQua.setText(items[i].toString());
//            }
//        });
//        myDialog.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                textViewKetQua.setText(items[i].toString());
//            }
//        });
        final boolean[] arraycheck = {true,false,true};
        myDialog.setMultiChoiceItems(items, arraycheck, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                arraycheck[i] = b;
            }
        });
        myDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String st = "";
                for(int j= 0 ;j<items.length;j++){
                    if(arraycheck[j])
                        st += items[j].toString() + "\n";
                }
                textViewKetQua.setText(st);
            }
        });
//        myDialog.setPositiveButton("Cance", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });
        AlertDialog alertDialog = myDialog.create();
        alertDialog.show();
    }
}