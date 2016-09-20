package com.trust.instagramclient.Retrofit;

import com.trust.instagramclient.Model.LoginModel;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LoginObj {
    @GET("/login/{user}&{password}")
    List<LoginModel> login(@Path("user") String user);
}
