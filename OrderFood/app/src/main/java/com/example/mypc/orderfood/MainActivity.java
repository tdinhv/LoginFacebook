package com.example.mypc.orderfood;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerListCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       spinnerListCity = (Spinner) findViewById(R.id.spinner);
        ArrayList<String> arrayCity = new ArrayList<String>();
        arrayCity.add("Hue");
        arrayCity.add("Da Nang");
        arrayCity.add("Sai Gon");
        arrayCity.add("Ha Noi");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayCity);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinnerListCity.setAdapter(arrayAdapter);
        TextView home = (TextView) findViewById(R.id.textViewHome);
        TextView cat = (TextView) findViewById(R.id.textViewCat);
        TextView ring = (TextView) findViewById(R.id.textViewRing);
        TextView pro = (TextView) findViewById(R.id.textViewPro);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/fontawesome-webfont.ttf");
        home.setTypeface(font);
        cat.setTypeface(font);
        ring.setTypeface(font);
        pro.setTypeface(font);

        home.setText("\uf015");
        cat.setText("\uf022");
        ring.setText("\uf0f3");
        pro.setText("\uf007");
    }

}
