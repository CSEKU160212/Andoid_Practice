package com.cseku_160212.listviewwithcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int[] movie_poster = {
            R.drawable.movieposter, R.drawable.movieposter,
            R.drawable.movieposter, R.drawable.movieposter,
            R.drawable.movieposter, R.drawable.movieposter,
            R.drawable.movieposter, R.drawable.movieposter,
            R.drawable.movieposter, R.drawable.movieposter,
    };

    String[] movies_name;
    String[] movies_rating;

    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        movies_name = getResources().getStringArray(R.array.movie_name);

        movies_rating = getResources().getStringArray(R.array.rating);

        adapter = new MovieAdapter(getApplicationContext(), R.layout.row_layout);

        listView.setAdapter(adapter);

        int i=0;

        for (String title : movies_name) {
            MovieDataProvider dataProvider = new MovieDataProvider(movie_poster[i], title, movies_rating[i]);
            adapter.add(dataProvider);
            i++;
        }
    }
}
