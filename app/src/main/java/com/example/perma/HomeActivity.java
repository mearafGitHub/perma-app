package com.example.perma;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    private ListView chaptersList;

    String cTitles[] = {
            "Basics",
            "Chapter One: Title",
            "Chapter Two: Title" ,
            "Chapter Three: Title",
            "Chapter Four: Title",
            "Chapter Five: Title",
            "Chapter Six: Title",
            "Chapter Seven: Title",
            "Wrap Up"};

    String[]cDescription = {
            "Basics description",
            "description  description description description description description description",
            "description  description description description description description description",
            "description  description description description description description description",
            "description  description description description description description description",
            "description  description description description description description description",
            "description  description description description description description description",
            "description  description description description description description description",
            "wrap up wrap up wrap up wrap up"
    };

    int cImages[] = {
            R.drawable.undraw_a_day_at_the_park_owg1,
            R.drawable.undraw_easter_egg_hunt_r36d,
            R.drawable.undraw_children_4rtb,
            R.drawable.ic_undraw_sunlight_tn7t,
            R.raw.plantoffice,
            R.raw.sproutplant,
            R.raw.shoppingbag,
            R.drawable.undraw_summer_jx06,
            R.drawable.undraw_raining_sguh
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_one);

        chaptersList = findViewById(R.id.homeChapterList);
    }


}
