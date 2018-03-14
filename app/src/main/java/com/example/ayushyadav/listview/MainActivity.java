package com.example.ayushyadav.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Using predefined array adapter

    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    //do not define array list initialise it. Otherwise it will give a null pointer exception

    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Activity Reached", "line 22 executed");

        listView = findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        //To add something to list view add it to array list

        arrayList.add("I added something to array list");
    }
}
