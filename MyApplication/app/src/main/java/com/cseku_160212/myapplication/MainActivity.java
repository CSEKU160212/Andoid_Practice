package com.cseku_160212.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText, editText2;
    public final static String MESSAGE_KEY ="com.cseku_160212.myapplication.MESSAGE_KEY";
    public final static String MESSAGE_KEY2 ="com.cseku_160212.myapplication.MESSAGE_KEY2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonOnclick(View view)
    {
        editText = (EditText) findViewById(R.id.editText_id);
        editText2 = (EditText) findViewById(R.id.edittext2);
        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra(MESSAGE_KEY, message);
        i.putExtra(MESSAGE_KEY2, message2);
        startActivity(i);
     }
}
