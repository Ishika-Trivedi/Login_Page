package com.example.loginpage;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface InterfaceAPI {

    @POST("user.accounts/checkLogin")
    Call<String> checkLogin(@Header("Authorization") String authToken);

}