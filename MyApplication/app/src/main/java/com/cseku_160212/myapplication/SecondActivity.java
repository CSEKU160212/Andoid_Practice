package com.cseku_160212.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public final static String MESSAGE_KEY ="com.cseku_160212.myapplication.MESSAGE_KEY";
    public final static String MESSAGE_KEY2 ="com.cseku_160212.myapplication.MESSAGE_KEY2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message2 = intent.getStringExtra(MESSAGE_KEY);
        String message = intent.getStringExtra(MESSAGE_KEY2);
        TextView textView = new TextView(this);
        textView.setTextSize(25);
        textView.setText(message2+"\n"+message);
        setContentView(textView);

    }
}
