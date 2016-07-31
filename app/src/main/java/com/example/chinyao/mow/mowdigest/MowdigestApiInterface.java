package com.example.chinyao.mow.mowdigest;

import com.example.chinyao.mow.mowdigest.model.MowdigestArticleSearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by chinyao on 7/30/2016.
 */
public interface MowdigestAPIInterface {
    // OkHttp is better than android-async-http
    // http://guides.codepath.com/android/Using-Android-Async-Http-Client
    // http://guides.codepath.com/android/Using-OkHttp
    // Gson fromJson() to Java class.
    // http://guides.codepath.com/android/Leveraging-the-Gson-Library
    // Retrofit is based on OkHttp
    // http://guides.codepath.com/android/Consuming-APIs-with-Retrofit
    // Debug network activity
    // http://guides.codepath.com/android/Debugging-with-Stetho
    // http://stackoverflow.com/questions/35444136/stetho-dont-see-network-calls-in-console
    // chrome://inspect/#devices

    // GET Retrofit.Builder().baseUrl() + the following link filled with @Path + ?@Query=
    // time_period from 1 to unknown
    // offset from 0, 20, 40...
    @GET(MowdigestFragment.MOST_POPULAR + "/{section}/{time_period}.json")
    Call<MowdigestArticleSearch> getSearch(@Path("section") String section,
                                           @Path("time_period") String time_period,
                                           @Query("offset") String offset,
                                           @Query("api-key") String api_key
    );
}