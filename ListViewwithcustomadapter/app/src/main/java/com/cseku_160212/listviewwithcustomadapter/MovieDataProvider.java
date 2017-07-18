package com.cseku_160212.listviewwithcustomadapter;

/**
 * Created by CSEKU_160212 on 06/25/2017.
 */

public class MovieDataProvider {
    private int moviePosterResources;
    private String movieName;
    private String movieRating;


    public MovieDataProvider(int moviePosterResources, String movieName, String movieRating) {
        this.setMoviePosterResources(moviePosterResources);
        this.setMovieName(movieName);
        this.setMovieRating(movieRating);
    }

    public int getMoviePosterResources() {
        return moviePosterResources;
    }

    public void setMoviePosterResources(int moviePosterResources) {
        this.moviePosterResources = moviePosterResources;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }
}
