package com.example.multidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Dash_Calci extends AppCompatActivity
{

    Button Add, Sub, Div, Mul, Cls;
    private EditText etn1, etn2;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_calci);

        etn1=findViewById(R.id.editTextNum1);
        etn2=findViewById(R.id.editTextNum2);
        tvResult=findViewById(R.id.textView2);
        Cls=findViewById(R.id.btnAllClear);

        Cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etn1.setText("");
                etn2.setText("");
                tvResult.setText("");
            }
        });
    }

    public void btnAdd(View view)
    {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1+n2;
        tvResult.setText(String.valueOf(sum));
    }

    public void btnSub(View view)
    {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sub = n1-n2;
        tvResult.setText(String.valueOf(sub));
    }

    public void btnDiv(View view)
    {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int div = n1/n2;
        tvResult.setText(String.valueOf(div));
    }

    public void btnMul(View view)
    {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int Mul = n1*n2;
        tvResult.setText(String.valueOf(Mul));
    }

}