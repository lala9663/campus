package com.jpa.todolist.dto;

import com.sun.tools.javac.comp.Todo;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TodoResponse {
    private String id;
    private String todos;

    public TodoResponse(Todo todo) {
        this.id = String.valueOf(todo.ge);
        this.todos = todo.getTodos();
    }

}
