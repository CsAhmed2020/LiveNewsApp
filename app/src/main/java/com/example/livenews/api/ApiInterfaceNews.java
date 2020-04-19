package com.example.livenews.api;


import com.example.livenews.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterfaceNews {

    @GET("top-headlines")
    Call<News> getNews(

            @Query("country") String country,
            @Query("apiKey") String apiKey

    );

    @GET("everything")
    Call<News> getNewsSearch(

            @Query("q") String keyword,
            @Query("language") String language,
            @Query("sortBy") String sortBy,
            @Query("apiKey") String apiKey

    );

}
