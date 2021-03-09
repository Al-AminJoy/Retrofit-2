package com.alamin.retrofit2;

import com.alamin.retrofit2.pojo.MultipleResource;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/api/unknown")
    Call<MultipleResource> getAllResources();
}
