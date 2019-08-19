package com.example.mobilenewsapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface
{
    @GET("NewsList")
    Call<News[]> getNews();
}
