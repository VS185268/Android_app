package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.btn_1);
        EditText name,Dob,Email,Addr;
        name=findViewById(R.id.Name);
        Dob=findViewById(R.id.DOB);
        Email=findViewById(R.id.Email);
        Addr=findViewById(R.id.Address);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String G_Name=name.getText().toString();
                String G_Dob=Dob.getText().toString();
                String G_Email=Email.getText().toString();
                String G_Addr=Addr.getText().toString();

                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("Name",G_Name);
                intent.putExtra("dob",G_Dob);
                intent.putExtra("email",G_Email);
                intent.putExtra("addr",G_Addr);
                startActivity(intent);


            }
        });
    }
}