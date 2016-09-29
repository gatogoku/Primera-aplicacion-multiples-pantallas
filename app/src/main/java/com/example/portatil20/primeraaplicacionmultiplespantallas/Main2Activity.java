package com.example.portatil20.primeraaplicacionmultiplespantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }



    public void IMC (View view ) {

        Intent intent = new Intent (this, Main2Activity.class);
        startActivity(intent) ;
    }



    public void HELP (View view ) {

        Intent intent = new Intent (this, Main2Activity.class);
        startActivity(intent) ;
    }



    public void ABOUT (View view ) {

        Intent intent = new Intent (this, Main2Activity.class);
        startActivity(intent) ;
    }











}
