package com.example.demowebservice

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService{

    @GET("/users/{username}")

    fun buscarUsuario(@Path("username")nomeUsuario: String) : Call<Usuario>
}