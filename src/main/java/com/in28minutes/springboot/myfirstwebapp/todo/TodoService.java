package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos;

    static {
        todos.add(new Todo(1, "in28minutes", "Learn AWS", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(2, "in28minutes", "Learn DevOps", LocalDate.now().plusMonths(3), false));
        todos.add(new Todo(3, "in28minutes", "Learn Full Stack Development", LocalDate.now().plusMonths(1), false));
        todos.add(new Todo(4, "in28minutes", "Learn GCP", LocalDate.now().plusMonths(10), false));

    }

    public List<Todo> findByUsername(String username){return todos;}

}
