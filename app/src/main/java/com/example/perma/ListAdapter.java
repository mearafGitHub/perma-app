package com.example.perma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perma.framework.ListViewHolder;

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class PermaAdapter extends ArrayAdapter<String> {
        Context context;
        String aTitle[];
        String aDescripstion[];
        int aImage[];


        PermaAdapter(Context context, String title[], String description[], int images[]){
            super(context, R.layout.chapters_list,R.id.titleText,title);
            this.aTitle = title;
            this.aDescripstion = description;
            this.aImage = images;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
           // LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ImageView image = row.findViewById(R.id.imageBanner);
            TextView title = row.findViewById(R.id.titleText);
            TextView description = row.findViewById(R.id.descriptionText);




            return row;
        }
    }
}
