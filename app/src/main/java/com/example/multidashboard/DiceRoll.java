package com.example.multidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class DiceRoll extends AppCompatActivity {

    Button myButton;
    TextView txt1;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roll);

        // used variables to assign the functionality of button and text views
        myButton = (Button) findViewById(R.id.my_button);
        txt1 = findViewById(R.id.myTextView1);
        txt2 = findViewById(R.id.myTextView2);

        // used random function to generate random values in textview1 and declared a variable name rand.
        Random rand = new Random();

        // random values to be generated on button click action usoing below code
        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // here i have used a toast just to check the click action is working
                Toast.makeText(getApplicationContext(),"You pressed the button", Toast.LENGTH_SHORT).show();

                // here i have used random function to show the random values in textbox1
                // i have used random command and 'rand' variable
                // number variable is declared to get the numbers below 'bound: 6' represents the values will be shown upto 6 and +1 used to increment the number":
                int number = rand.nextInt(6) + 1;
                txt1.setText(String.valueOf(number));

                // here i have used string to show the random values in textbox2
                // i have initialise string variable dice and using getResources command and getStringArray command i have used array created in string.xml file.

                String[] Dice = getResources().getStringArray(R.array.myDiceList);
                int  n = rand.nextInt(Dice.length);
                txt2.setText(Dice[n]);


            }
        });


    }
}