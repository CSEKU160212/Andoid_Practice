package com.cseku_160212.listviewwithcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CSEKU_160212 on 06/25/2017.
 */

public class MovieAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public MovieAdapter( Context context, int resource) {
        super(context, resource);
    }


    public static class MovieHandler{
        ImageView poster;
        TextView Title;
        TextView Rating;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        View row;
        row = convertView;

        MovieHandler handler;

        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout, parent, false);
            handler=new MovieHandler();
            handler.poster= (ImageView) row.findViewById(R.id.imageView);
            handler.Title = (TextView) row.findViewById(R.id.movie_Title);
            handler.Rating = (TextView) row.findViewById(R.id.movie_Rating);

            row.setTag(handler);
        }

        else
        {
            handler=(MovieHandler) row.getTag();
        }

        MovieDataProvider dataProvider = (MovieDataProvider) this.getItem(position);

        handler.poster.setImageResource(dataProvider.getMoviePosterResources());
        handler.Title.setText(dataProvider.getMovieName());
        handler.Rating.setText(dataProvider.getMovieRating());

        return row;
    }
}
