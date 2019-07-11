package com.example.rentcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class OfertyActivity extends AppCompatActivity {
    PomocnikBazaDanych mPomocnikBazaDanych;

     EditText model;
     EditText typ;
    EditText rocznik;
    EditText cena;
    Button dodajOfertee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oferty);
         model =(EditText) findViewById(R.id.etModel);
        typ =(EditText) findViewById(R.id.etTyp);
        rocznik = (EditText)findViewById(R.id.etRocznik);
        cena =(EditText) findViewById(R.id.etCena);
       mPomocnikBazaDanych = new PomocnikBazaDanych(this);
        dodajOfertee = findViewById(R.id.bDodajOferte);

    AddData();
    }

    public void AddData() {
        dodajOfertee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean newEntry = mPomocnikBazaDanych.addData(model.getText().toString(),typ.getText().toString(),rocznik.getText().toString(),cena.getText().toString());
                if (newEntry = true) {
                    Toast.makeText(OfertyActivity.this,"Data Successfully Inserted!",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(OfertyActivity.this,"Wrong :)",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
