package com.example.demo;

import static com.example.demo.R.id.Certifications;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button b3=findViewById(R.id.btn_3);
        EditText Languages,Internships,certifications;
        Languages=findViewById(R.id.Languages);
        certifications =findViewById(R.id.Certifications);
        Internships=findViewById(R.id.Internship);
        Bundle PrevInfo=getIntent().getExtras();
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Lan=Languages.getText().toString();
                String Certi=certifications.getText().toString();

                String Intern=Internships.getText().toString();

                Intent intent=new Intent(getApplicationContext(),MainActivity4.class);
                intent.putExtras(PrevInfo);
                intent.putExtra("Lan",Lan);

                intent.putExtra("Certifications",Certi);
                intent.putExtra("Intern",Intern);
                startActivity(intent);


            }
        });
    }
}