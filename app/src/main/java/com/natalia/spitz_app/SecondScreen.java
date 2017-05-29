package com.natalia.spitz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondScreen extends AppCompatActivity {

    ListView firstList;
    ListView secondList;
    String[] firstItems, secondItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        firstList = (ListView)findViewById(R.id.first_list);
        secondList = (ListView)findViewById(R.id.second_list);

        firstItems = getResources().getStringArray(R.array.second_screen);
        secondItems = getResources().getStringArray(R.array.second_screen2);

        ArrayAdapter<String> firstAdapter = new ArrayAdapter<String>(this,R.layout.list_item,firstItems);

        ArrayAdapter<String> secondAdapter = new ArrayAdapter<String>(this,R.layout.list_item,secondItems);

        firstList.setAdapter(firstAdapter);
        secondList.setAdapter(secondAdapter);
    }
}
