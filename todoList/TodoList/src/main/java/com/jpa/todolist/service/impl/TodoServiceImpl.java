package com.jpa.todolist.service.impl;

import com.jpa.todolist.dto.TodoResponse;
import com.jpa.todolist.entity.Todo;
import com.jpa.todolist.repository.TodoRepository;
import com.jpa.todolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<TodoResponse> todoList() {
        return todoRepository.findAll().stream()
                .map(en -> new TodoResponse(en))
                .collect(Collectors.toList());
    }

    @Override
    public String deleteTodo(String id) {
        try {
            todoRepository.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            e.getStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String insertTodo(String todos) {
        try {
            todoRepository.save(Todo.builder()
                    .todos(todos)
                    .build());
        } catch (Exception e) {
            e.getStackTrace();
            return "failed";
        }
        return "success";
    }
}
