package com.jpa.todolist.controller;

import com.jpa.todolist.dto.TodoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TodoController {
    private final TodoController todoService;

    @GetMapping("/todos")
    public List<TodoResponse> todolist() {
        return todoService.todolist();
    }

    @DeleteMapping("todos/{id}")
    public String deleteTodos(@PathVariable("id") String id) {
        return todoService.deleteTodos(id);
    }

    @PostMapping("/todos")
    public String insertTodos(String todos) {
        return todoService.insertTodos(todos);
    }
}
