package com.neeloo.PraticeTest.controller;

import com.neeloo.PraticeTest.model.Todo;
import com.neeloo.PraticeTest.service.Todoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    public TodoController(Todoservice todoservice) {
        this.todoservice = todoservice;
    }

    @Autowired
    private Todoservice todoservice;

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoservice.getAllTodos();
    }

    @GetMapping("/{id}")
    public  Todo getTodoByID(@PathVariable int id){
        return todoservice.getTodoById(id);
    }

    @PostMapping
    public  Todo addTodos(@RequestBody Todo todo){
      return  todoservice.addTodo(todo);
    }
}
