package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Bundle B=getIntent().getExtras();
        String Name=B.getString("Name");
        String Dob=B.getString("dob");
        String email=B.getString("email");
        String Addr=B.getString("addr");
        String Qual=B.getString("Qual");
        String Percen=B.getString("Percen");
        String Coll=B.getString("Coll");
        String Languages=B.getString("Lan");
        String Certifications=B.getString("Certifications");
        String Intern=B.getString("Intern");
        TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        t9=findViewById(R.id.t9);
        t10=findViewById(R.id.t10);

        t1.setText(Name);
        t2.setText(Dob);
        t3.setText(email);
        t4.setText(Addr);
        t5.setText(Qual);
        t6.setText(Percen);
        t7.setText(Coll);
        t8.setText(Languages);
        t9.setText(Certifications);
        t10.setText(Intern);





    }
}