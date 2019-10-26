package com.example.perma.framework;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perma.R;

import butterknife.BindView;

public class ListViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.titleText)
    TextView title;

    @BindView(R.id.descriptionText)
    TextView description;

    @BindView(R.id.imageBanner)
    ImageView imgae;

    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
