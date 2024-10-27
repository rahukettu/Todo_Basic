package com.example.todo_basic.api

import com.example.todo_basic.model.BASE_URL
import com.example.todo_basic.model.TodosApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



object NetworkModule {
    private var todosService: TodosApi? = null

    fun getInstance(): TodosApi {
        if (todosService == null) {
            todosService = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(TodosApi::class.java)
        }
        return todosService!!
    }
}