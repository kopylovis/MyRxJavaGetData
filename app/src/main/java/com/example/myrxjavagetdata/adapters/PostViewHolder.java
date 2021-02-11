package com.example.myrxjavagetdata.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrxjavagetdata.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView userId, id, titile, body;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        userId = itemView.findViewById(R.id.piUserId);
        id = itemView.findViewById(R.id.piId);
        titile = itemView.findViewById(R.id.piTitle);
        body = itemView.findViewById(R.id.piBody);
    }
}
