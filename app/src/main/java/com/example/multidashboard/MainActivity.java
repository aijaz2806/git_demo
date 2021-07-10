package com.example.multidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     ImageView imgPerson, imgCalendar, imgCalculator, imgBitcoin;
    ImageView imgSongs, imgVaccine,imgMovies, imgWikipedia;
    ImageView imgW3schools, imgDiceRoll , imgLsViews;
    DatePicker myPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPerson = findViewById(R.id.imgPersonHead);
        imgBitcoin= findViewById(R.id.myBitcoin);
        imgCalculator=findViewById(R.id.myCalculator);
        imgCalendar=findViewById(R.id.myCalendar);
        imgMovies=findViewById(R.id.myMovies);
        imgSongs=findViewById(R.id.mySongs);
        imgVaccine=findViewById(R.id.myVaccine);
        imgW3schools=findViewById(R.id.myStudy);
        imgWikipedia=findViewById(R.id.myWikipedia);
        imgDiceRoll=findViewById(R.id.myDiceRoll);
        imgLsViews=findViewById(R.id.myListView);


        // Head icon touching
        imgPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent HeadIcon = new Intent(MainActivity.this,MyResume.class);
                startActivity(HeadIcon);
                Toast.makeText(getApplicationContext(),"Welcome to the Dashboard",Toast.LENGTH_LONG).show();
            }
        });


        // Calendar
        imgCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent cal =new Intent(MainActivity.this, Dash_Cal.class);
                startActivity(cal);

            }
        });

        // Calculator
        imgCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent myCalci = new Intent(MainActivity.this,Dash_Calci.class);
                startActivity(myCalci);

            }
        });

        //List view
        imgLsViews.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent List =new Intent(MainActivity.this,listTesting.class);
                startActivity(List);

            }
        });

        //Wikipedia
        imgWikipedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                gotoUrl("https://www.wikipedia.org/");
            }
        });

        //study schools
        imgW3schools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                gotoUrl("https://www.w3schools.com/");

            }
        });

        // Covid Vaccination
        imgVaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                gotoUrl("https://www.cowin.gov.in/home");

            }
        });

        //songs
        imgSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                gotoUrl("https://wynk.in/music");

            }
        });

        //Movies
        imgMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                gotoUrl("https://pahe.ph/");

            }
        });

        //Bitcoin
        imgBitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                gotoUrl("https://coinmarketcap.com/");

            }
        });

        imgDiceRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent myDice = new Intent(MainActivity.this, DiceRoll.class);
                startActivity(myDice);

            }
        });

    }

    private void gotoUrl(String s)
    {
        Uri uri =Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}