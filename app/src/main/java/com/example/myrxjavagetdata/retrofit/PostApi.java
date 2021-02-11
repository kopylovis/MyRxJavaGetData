package com.example.myrxjavagetdata.retrofit;

import android.database.Observable;
import com.example.myrxjavagetdata.models.Post;
import java.util.List;
import retrofit2.http.GET;

public interface PostApi {
    @GET("posts")
    Observable<List<Post>> getPost();
}
