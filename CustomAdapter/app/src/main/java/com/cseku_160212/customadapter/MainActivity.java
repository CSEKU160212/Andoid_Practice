package com.cseku_160212.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int[] student_photo_resources = {
            R.drawable.id160201, R.drawable.id160202,
            R.drawable.id160204, R.drawable.id160205,
            R.drawable.id160206, R.drawable.id160207,
            R.drawable.id160208, R.drawable.id160209,
            R.drawable.id160210, R.drawable.id160211,
            R.drawable.id160212, R.drawable.id160213,
            R.drawable.id160214, R.drawable.id160215,
            R.drawable.id160216, R.drawable.id160218,
            R.drawable.id160219, R.drawable.id160220,
            R.drawable.id160221, R.drawable.id160222,
            R.drawable.id160224, R.drawable.id160225,
            R.drawable.id160226, R.drawable.id160227,
            R.drawable.id160228, R.drawable.id160230,
            R.drawable.id160231, R.drawable.id160232,
            R.drawable.id160234, R.drawable.id160235,
            R.drawable.id160236, R.drawable.id160237,
            R.drawable.id160238, R.drawable.id160239,
            R.drawable.id160240,
    };
    String[] studentName;
    String[] studentId;

    StudentAdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.main_list_view);

        studentId = getResources().getStringArray(R.array.student_id_array);

        studentName = getResources().getStringArray(R.array.student_name_array);


        adapter = new StudentAdapterClass(getApplicationContext(), R.layout.custom_list_view_layout);

        listView.setAdapter(adapter);

            int i = 0;

            for (int studentPhoto : student_photo_resources) {
                studentDataProvider dataProvider = new studentDataProvider(studentPhoto, studentId[i], studentName[i]);

                adapter.add(dataProvider);

                i++;
            }

    }
}

