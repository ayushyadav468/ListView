package com.example.ayushyadav.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ayushyadav on 14/03/18.
 */

public class CustomAdapter extends BaseAdapter {

    // These are the basic things for custom adapter
    Context context;
    ArrayList<ClassForThingsToBeAddedToCustomLayout> customArrayList;

    // Constructor
    public CustomAdapter(Context context, ArrayList<ClassForThingsToBeAddedToCustomLayout> customArrayList) {
        this.context = context;
        this.customArrayList = customArrayList;
    }

    @Override
    public int getCount() {
        return customArrayList.size();
    }

    @Override
    public ClassForThingsToBeAddedToCustomLayout getItem(int position) {
        return customArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // LayoutInflater is an abstract class(i.e we can use it without making an object of this class)

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //A new view object is made so that we can use convertView without changing it's actual value just like a pointer

        convertView = layoutInflater.inflate(R.layout.customlayout,parent,false);

        // if convertView is zero i.e. no object is added to listView
        // this will happen only the first time
        // to save time we prefer this technique
        // To inflate the custom made layout
        // Find textView
        TextView textView = convertView.findViewById(R.id.textView);
        textView.setText(customArrayList.get(position).getName());
        // Set textView


        return convertView;
    }

}
