package com.example.myrxjavagetdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myrxjavagetdata.retrofit.PostApi;
import com.example.myrxjavagetdata.retrofit.RetrofitClient;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    PostApi postApi;
    RecyclerView recyclerViewPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //API
        Retrofit retrofit = RetrofitClient.getInstance();
        postApi = retrofit.create(PostApi.class);

        //RecyclerViewInit
        recyclerViewPosts = findViewById(R.id.amRecyclerViewPosts);
        recyclerViewPosts.setLayoutManager(new LinearLayoutManager(this));
    }
}