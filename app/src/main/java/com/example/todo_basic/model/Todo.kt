package com.example.todo_basic.model
import android.icu.text.CaseMap.Title
import retrofit2.http.GET


data class Todo(
    var userId: Int,
    var id: Int,
    var title: String,
    var completed: Boolean
)


const val BASE_URL = "http://jasonplaceholder.typicode.com"

interface TodosApi {
    @GET("todos")
    suspend fun getTodos(): List<Todo>
}