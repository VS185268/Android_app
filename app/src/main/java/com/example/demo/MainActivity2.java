package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.tv.TvContract;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText Qualification,Percentage,College;
        Qualification =findViewById(R.id.Qualification);
        Percentage=findViewById(R.id.Percentage);
        College=findViewById(R.id.College);
        Bundle PrevInfo=getIntent().getExtras();
        Button B2=findViewById(R.id.btn_2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity3.class);
                i.putExtras(PrevInfo);
                String Qual=Qualification.getText().toString();
                String Percen=Percentage.getText().toString();
                String Coll=College.getText().toString();
                i.putExtra("Qual",Qual);
                i.putExtra("Percen",Percen);
                i.putExtra("Coll",Coll);
                startActivity(i);
            }
        });


    }
}