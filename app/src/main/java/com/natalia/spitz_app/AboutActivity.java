package com.natalia.spitz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutActivity extends AppCompatActivity {

    ListView aboutList;
    String[] aboutItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutList = (ListView)findViewById(R.id.aboutList);
        aboutItems = getResources().getStringArray(R.array.first_screen);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item,aboutItems);
        aboutList.setAdapter(adapter);
    }
}
