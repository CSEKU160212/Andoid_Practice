package com.cseku_160212.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =(TextView) findViewById(R.id.finalResult);
    }

    public void selectItem(View v)
    {
        boolean checked = ((RadioButton)v).isChecked();
        switch (v.getId())
        {
            case R.id.buet:

                if(checked) {
                    textView.setText("BUET");
                }

                break;

            case R.id.kuet:

                if(checked) {
                    textView.setText("KUET");
                }

                break;
            case R.id.ruet:

                if(checked) {
                    textView.setText("RUET");
                }

                break;
            case R.id.cuet:

                if(checked) {
                    textView.setText("CUET");
                }

                break;
            case R.id.du:

                if(checked) {
                    textView.setText("DU");
                }

                break;
            case R.id.ju:

                if(checked) {
                    textView.setText("JU");
                }

                break;
            case R.id.ku:

                if(checked) {
                    textView.setText("KU");
                }

                break;
            case R.id.ru:

                if(checked) {
                    textView.setText("RU");
                }

                break;
        }
    }
}
