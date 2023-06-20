package com.jpa.todolist.service;

import com.jpa.todolist.dto.TodoResponse;

import java.util.List;

public interface TodoService {

    List<TodoResponse> todoList();

    String deleteTodo(String id);

    String insertTodo(String todos);


}
