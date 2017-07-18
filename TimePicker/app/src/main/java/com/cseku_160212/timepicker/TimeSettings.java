package com.cseku_160212.timepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by CSEKU_160212 on 06/26/2017.
 */

public class TimeSettings implements TimePickerDialog.OnTimeSetListener {

    Context contex;

    public TimeSettings(Context context)
    {
        this.contex = context;
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int minute) {

        Toast.makeText(contex, "Selected time is "+hour+" Hour and "+minute +" Minute",Toast.LENGTH_LONG).show();
    }
}
