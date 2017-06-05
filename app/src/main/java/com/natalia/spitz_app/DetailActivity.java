package com.natalia.spitz_app;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    String history, intrestingFact, brains,learning,character,yourApartment,eatPuppy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getStrings();
        TextView tv = (TextView)findViewById(R.id.textInfo);
        ImageView picture = (ImageView)findViewById(R.id.picture);
        ImageView pictireSecond = (ImageView)findViewById(R.id.pictureSecond);

        Intent intent = getIntent();
        int number = intent.getIntExtra("number",0);
        switch (number){
            case 0:
                tv.setText(history);
                picture.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.history_pic));
                pictireSecond.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.history_pic2));
                break;
            case 1:
                tv.setText(character);
                picture.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.char1));
                pictireSecond.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.char2));
                break;
            case 2:
                tv.setText(intrestingFact);
                picture.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.fact1));
                pictireSecond.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.fact2));
                break;
        }

    }
     public void getStrings(){
         history = getResources().getString(R.string.history);
         intrestingFact = getResources().getString(R.string.interesting_fact);
         brains = getResources().getString(R.string.brains);

         learning = getResources().getString(R.string.care_string);
         character = getResources().getString(R.string.character);

         yourApartment = getResources().getString(R.string.your_apartment);

         eatPuppy = getResources().getString(R.string.eat_puppy);
     }


}
