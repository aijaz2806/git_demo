package com.example.multidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyResume extends AppCompatActivity {


    TextView myIns, myLink;
    Button myBtnInsta, myBtnLinked, myBack, myfacebook, myWeb;
    ImageView myInsimg, myLinkimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_resume);

        myBtnInsta=findViewById(R.id.myInstaID);
        myBtnLinked=findViewById(R.id.myLinkedInID);
        myBack=findViewById(R.id.myGoBack);
        myfacebook=findViewById(R.id.myFacebookbtn);
        myWeb=findViewById(R.id.myWebsite);



        myBtnInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
             gotoUrl("https://www.instagram.com/_siyahiwala_aiju/");
            }
        });

        myBtnLinked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/aijaz-ahmed-siyahi-337b88172/");
            }
        });


        myfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/aijaz.siyahi/");

            }
        });

        myBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(MyResume.this,MainActivity.class);
                startActivity(goBack);
            }
        });

        myWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("http://aijaztech.epizy.com");

            }
        });
    }


    private void gotoUrl(String s)
    {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}