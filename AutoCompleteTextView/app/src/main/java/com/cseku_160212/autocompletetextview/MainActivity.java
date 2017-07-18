package com.cseku_160212.autocompletetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;

    String [] UNIVERSIRY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.varsity);

        UNIVERSIRY = getResources().getStringArray(R.array.university_name);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, UNIVERSIRY);

        autoCompleteTextView.setAdapter(adapter);

    }
}