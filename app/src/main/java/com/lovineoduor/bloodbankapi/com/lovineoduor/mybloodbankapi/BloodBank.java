package com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BloodBank {

    @GET("bloodbank")
    Call<BloodBank> getBlood(
            @Query("donate") String donate,
            @Query("request") String request
    );
}
