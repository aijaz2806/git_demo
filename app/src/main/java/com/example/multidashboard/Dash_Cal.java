package com.example.multidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class Dash_Cal extends AppCompatActivity {

        Button myButton;
        TextView myTextView;
        DatePickerDialog myPicker;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dash_cal);


            myButton= findViewById(R.id.myButton);
            myTextView = findViewById(R.id.myTextView);

            myButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    final Calendar myCal = Calendar.getInstance();
                    int myDay = myCal.get(Calendar.DAY_OF_MONTH);
                    int myMonth = myCal.get(Calendar.MONTH);
                    int myYear = myCal.get(Calendar.YEAR);

                    myPicker = new DatePickerDialog(Dash_Cal.this, new DatePickerDialog.OnDateSetListener()
                    {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                        {
                            myTextView.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                        }
                    }, myYear, myDay, myMonth);
                    myPicker.show();
                }
            });

        }
}