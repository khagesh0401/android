package com.example.allinone001;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText name,number;
    String DOB,DOJ;
    AutoCompleteTextView destination;
    Button book;
    String[] places={"Banaglore","Hyderabad","Mumbai","Delhi","Pune"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        destination=findViewById(R.id.destination);
        book=findViewById(R.id.button);

        ArrayAdapter adapter= new ArrayAdapter<>(this, android.R.layout.select_dialog_item,places);
        destination.setThreshold(1);
        destination.setAdapter(adapter);

book.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent in=new Intent(getApplicationContext(), dis.class);
        in.putExtra("Name",name.getText().toString());
        in.putExtra("Number",number.getText().toString());
        in.putExtra("DOB:",DOB);
        in.putExtra("DOJ:",DOJ);
        in.putExtra("Destination:",destination.getText().toString());
        startActivity(in);
    }
});
    }
    public void Dateofbirth(View v){
        Calendar c= Calendar.getInstance();
        int pyear=c.get(Calendar.YEAR);
        int pmonth=c.get(Calendar.MONTH);
        int pday=c.get(Calendar.DATE);
        DatePickerDialog dialog=new DatePickerDialog(this, android.R.style.Theme_DeviceDefault_DialogWhenLarge, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                DOB=dayOfMonth+"/"+(month+1)+"/"+year;
            }
        },pyear,pmonth,pday);
        dialog.show();
    }

    public void Dateofjourney(View v){
        Calendar c= Calendar.getInstance();
        int pyear=c.get(Calendar.YEAR);
        int pmonth=c.get(Calendar.MONTH);
        int pday=c.get(Calendar.DATE);
        DatePickerDialog dialog=new DatePickerDialog(this, android.R.style.Theme_DeviceDefault_DialogWhenLarge, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                DOJ=dayOfMonth+"/"+(month+1)+"/"+year;
            }
        },pyear,pmonth,pday);
        dialog.show();
    }


}