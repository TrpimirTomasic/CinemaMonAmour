package com.example.trpimir.cinemamonamour.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.trpimir.cinemamonamour.models.FavMovie;

@Database(entities = {FavMovie.class}, version=1, exportSchema = false)
public abstract class MovieDatabase extends RoomDatabase {
    public abstract FavMovieDao favMovieDao();

}
