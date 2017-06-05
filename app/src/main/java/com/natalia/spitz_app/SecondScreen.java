package com.natalia.spitz_app;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        //secondList = (ListView)findViewById(R.id.second_list);

        firstItems = getResources().getStringArray(R.array.second_screen);
        //secondItems = getResources().getStringArray(R.array.second_screen2);

        ArrayAdapter<String> firstAdapter = new ArrayAdapter<String>(this,R.layout.list_item,firstItems);

        //ArrayAdapter<String> secondAdapter = new ArrayAdapter<String>(this,R.layout.list_item,secondItem s);

        firstList.setAdapter(firstAdapter);
        firstList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showEditDialog(position);

            }
        });
        //secondList.setAdapter(secondAdapter);
    }

    private void showEditDialog(int number) {
        FragmentManager fm = getSupportFragmentManager();
        DialogInfo editNameDialogFragment = DialogInfo.newInstance(number);
        editNameDialogFragment.show(fm, "fragment_edit_name");
    }

}
