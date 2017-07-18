package com.cseku_160212.timepicker;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setTime(View view)
    {
    DialogueHandler dialogueHandler = new DialogueHandler();
        dialogueHandler.show(getSupportFragmentManager(),"time_picker");
    }

}
