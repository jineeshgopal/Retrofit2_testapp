package com.example.spericorn.retrofit2_testapp;

import android.content.Context;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


public class ApiClient {

    public static final String BASE_URL = "https://dev.wb21.com/mobile/";
    private static Retrofit retrofit = null;
    static Context context;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}