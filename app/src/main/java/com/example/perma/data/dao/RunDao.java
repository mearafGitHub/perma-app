package com.example.perma.data.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.perma.data.model.Chapters;

import java.util.List;

@Dao

public interface RunDao {

    @Insert
    void addRun(Chapters chapters);

    @Query("SELECT * FROM chapters")
    List<Chapters> getAll();
}
