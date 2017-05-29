package com.natalia.spitz_app;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] names = {"История появления породы", "Характер собаки", "О породе", "Интересные факты о шпице", "Виды шпицев"};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.lvMain);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item, names);

        // присваиваем адаптер списку
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detailIntent = new Intent(MainActivity.this,DetailActivity.class);
                switch (position){
                    case 0:
                        startActivity(detailIntent);
                        break;
                    case 1:
                        startActivity(detailIntent);
                        break;
                    case 2:
                        Intent intentPor = new Intent(MainActivity.this,AboutActivity.class);
                        startActivity(intentPor);
                        break;
                    case 3:
                        startActivity(detailIntent);
                        break;
                    case 4:
                        Intent intent = new Intent(MainActivity.this,SecondScreen.class);
                        startActivity(intent);
                        break;
                 }

            }
        });
    }
}



