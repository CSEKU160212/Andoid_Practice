package com.cseku_160212.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class StudentAdapterClass extends ArrayAdapter {

        List list = new ArrayList();

    public StudentAdapterClass(Context context, int resource){
        super(context, resource);
    }

        public static class studentHandler {
            ImageView st_photo;
            TextView st_id;
            TextView st_name;
        }

        @Override
        public void add (Object object){
        super.add(object);
        list.add(object);
    }

        @Override
        public int getCount () {
        return this.list.size();
    }

        @Override
        public Object getItem ( int position){
        return this.list.get(position);
    }

        @Override
        public View getView ( int position, View convertView, ViewGroup parent){
        View row;
        row = convertView;
        studentHandler handler;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.custom_list_view_layout, parent, false);
            handler = new studentHandler();
            handler.st_photo = (ImageView) row.findViewById(R.id.student_image);
            handler.st_id = (TextView) row.findViewById(R.id.student_id);
            handler.st_name = (TextView) row.findViewById(R.id.student_name);

            row.setTag(handler);
        } else {
            handler = (studentHandler) row.getTag();
        }

        studentDataProvider dataProvider = (studentDataProvider) this.getItem(position);

        handler.st_photo.setImageResource(dataProvider.getStudentPhoto());
        handler.st_id.setText(dataProvider.getStudentId());
        handler.st_name.setText(dataProvider.getStudentName());

        return row;
    }

}
