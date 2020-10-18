package com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class BloodClient {

    private static Retrofit retrofit = null;

    public static BloodBankApi getClient() {

        if (retrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()

        }

    }

}
