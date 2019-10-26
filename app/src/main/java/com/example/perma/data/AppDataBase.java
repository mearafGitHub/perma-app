package com.example.perma.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.perma.data.dao.RunDao;
import com.example.perma.data.model.Chapters;


@Database(entities = {Chapters.class}, version =1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract RunDao runDao();
}
