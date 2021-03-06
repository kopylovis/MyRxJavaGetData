package com.example.myrxjavagetdata.retrofit;


import com.example.myrxjavagetdata.models.Post;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface PostApi {
    @GET("posts")
    Observable<List<Post>> getPost();
}
