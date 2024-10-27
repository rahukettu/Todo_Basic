package com.example.todo_basic.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todo_basic.model.Todo
import com.example.todo_basic.api.NetworkModule
import kotlinx.coroutines.launch

class TodoViewModel : ViewModel() {
    private val _todos = MutableLiveData<List<Todo>>()
    val todos: LiveData<List<Todo>> get() = _todos

    init {
        getTodosList()
    }


    private fun getTodosList() {
        viewModelScope.launch {
            try {
                val todosApi = NetworkModule.getInstance()
                val todoList = todosApi.getTodos()
                _todos.value = todoList
            } catch (e: Exception) {
                Log.d("TODOVIEWMODEL", e.message.toString())
            }
        }
    }
}


