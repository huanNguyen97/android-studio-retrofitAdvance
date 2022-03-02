package com.example.retrofittestingcallapi.api;

import androidx.annotation.Nullable;

import com.example.retrofittestingcallapi.model.Results;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    // Link url https://randomuser.me/api/0.4/?randomapi

    String url = "https://randomuser.me/";
    Gson gson = new GsonBuilder()
        .setDateFormat("yyyy-MM-dd HH:mm:ss")
        .create();

    ApiService apiService = new Retrofit.Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
        .create(ApiService.class);

    @GET("api/0.4/")
    Call<Results> ReadList();
}
