package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // /list-todos => Get all todos
    @RequestMapping("/list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("in28minutes");
        model.addAttribute("todos", todos);
        return "listTodos";
   }

   // GET, POST
    // /add-todo => Add a new todo
    @RequestMapping(value="/add-todo", method = RequestMethod.GET)
    public String showTodoPage() {
        return "todo";
    }

    @RequestMapping(value="/add-todo", method = RequestMethod.POST)
    public String addNewTodo(@RequestParam String description, ModelMap model) {
//        todoService.addTodo(model.get("name").toString(), description, LocalDate.now(), false);
        System.out.println(model.get("name"));
        return "redirect:/list-todos";

    }





}
