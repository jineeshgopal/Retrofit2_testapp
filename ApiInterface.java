package com.example.spericorn.retrofit2_testapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("movie/top_rated")
    Call<ModelResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("/machine_test.cfc?/method=forMachineTest")
    Call<ModelResponse> getmachine_test2();

    @GET("movie/{id}")
    Call<ModelResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}