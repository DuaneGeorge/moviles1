package com.example.aplicaciont2.service;



import com.example.aplicaciont2.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {

    @GET("users")
    public abstract Call<List<User>> listaUsuarios();

}
