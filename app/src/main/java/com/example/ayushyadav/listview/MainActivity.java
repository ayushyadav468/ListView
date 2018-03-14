package com.example.ayushyadav.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter customAdapter;
    ClassForThingsToBeAddedToCustomLayout classForThingsToBeAddedToCustomLayout;
    ArrayList<ClassForThingsToBeAddedToCustomLayout> arrayListForCustomAdapter = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        classForThingsToBeAddedToCustomLayout = new ClassForThingsToBeAddedToCustomLayout("Ayush Yadav");
        arrayListForCustomAdapter.add(classForThingsToBeAddedToCustomLayout);

        listView = findViewById(R.id.listView);
        customAdapter = new CustomAdapter(this, arrayListForCustomAdapter);

        listView.setAdapter(customAdapter);

    }

}
