package com.example.multidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listTesting extends AppCompatActivity {

    ListView myListObjInJava;

    String[] myFruitList = {"Apple","Mango","Banana","Grapes","Pomegranate","Orange",
            "kiwi","Watermelon","Plum","Guava",
            "Pineapple","Papaya","Strawberry","Guava"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_testing);

        myListObjInJava = (ListView)findViewById(R.id.Mylistview);

        ArrayAdapter<String> ourArrayAdapterForList = new ArrayAdapter<String>(this,R.layout.text, R.id.mytextView,myFruitList);

        myListObjInJava.setAdapter(ourArrayAdapterForList);

        myListObjInJava.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(listTesting.this,"You Clicked " + myFruitList[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}