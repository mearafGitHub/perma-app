package com.example.perma.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "chapters")
public class Chapters {


    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo
    public double title;

    @ColumnInfo
    public int description;

   /* @ColumnInfo(name = "created_at")
    public String createdAt; */
}

