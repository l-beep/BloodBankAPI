package com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BloodClient {

    private static final String BLOODBANK_BASE_URL = "https://addata.gov.ae/api/action/datastore/search.json?resource_id=ac317377-bd97-49bd-98c4-b744084d24c9";
    private static Retrofit retrofit = null;

    public static BloodBankApi getClient() {

        if (retrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        private static final String BLOODBANK_API_KEY = "https://addata.gov.ae/api/action/datastore/search.json?resource_id=ac317377-bd97-49bd-98c4-b744084d24c9";

                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request newRequest = chain.request().newBuilder()
                                    .addHeader("Authorization", BLOODBANK_API_KEY)
                                    .build();
                            return chain.proceed(newRequest);
                        }
                    })
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BLOODBANK_BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(BloodBankApi.class);
    }
}

