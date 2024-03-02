package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "in28minutes", "Learn AWS", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn DevOps", LocalDate.now().plusMonths(3), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn Full Stack Development", LocalDate.now().plusMonths(1), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn GCP", LocalDate.now().plusMonths(10), false));

    }

    public List<Todo> findByUsername(String username){return todos;}

    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone){
        todos.add(new Todo(++todosCount, username, description, targetDate, isDone));
    }

}
