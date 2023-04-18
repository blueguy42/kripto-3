package com.fsck.k9.retrofit;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitHandler {
    private static final String BASE_URL = "https://kripto3-api.afanhandoyo.com";

    private static RetrofitAPI retrofitAPI;
    public static RetrofitAPI getApiService() {
        if (retrofitAPI == null) {
            Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

            retrofitAPI = retrofit.create(RetrofitAPI.class);
        }

        return retrofitAPI;
    }
}
