package com.cseku_160212.buttonlistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imgBn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBn  = (ImageButton) findViewById(R.id.logoButton);
        imgBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "You Click on img button", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void textButton(View v)
    {
        Toast.makeText(getBaseContext(), "You Click on Text button", Toast.LENGTH_SHORT).show();
    }

    public void bn(View v)
    {
        Toast.makeText(getBaseContext(), "You Click on button", Toast.LENGTH_SHORT).show();

    }

}



