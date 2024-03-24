package com.example.allinone001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class dis extends AppCompatActivity {
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis);
        res=findViewById(R.id.res);
        Integer curr=2024;
        Intent intt=getIntent();
        String name=intt.getStringExtra("Name");
        String number=intt.getStringExtra("Number");
        String DOB=intt.getStringExtra("DOB");
        String DOJ=intt.getStringExtra("DOJ");
        String Destination=intt.getStringExtra("Destination");
        Integer DOB1=Integer.parseInt(DOB,0);
        Integer age=curr-DOB1;

        res.setText("Name "+name+"\nNumber "+number+"\nDOB "+DOB+"\nDOJ "+DOJ+"\nDestination "+Destination+"\nAge "+age);
        Toast.makeText(dis.this,"Success",Toast.LENGTH_SHORT).show();
    }
}