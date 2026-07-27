package com.neeloo.PraticeTest.service;

import com.neeloo.PraticeTest.model.Todo;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Todoservice {

    private List<Todo> todos = new ArrayList<>();

    public  Todoservice (){
        todos.add(new Todo(1 ,"java" , true));
        todos.add(new Todo(2, "reactjs",false));
        todos.add(new Todo(3 , "spring boot",true));
    }

    public List<Todo> getAllTodos(){
        return todos;
    }

    public Todo getTodoById(int id){
        for(Todo t :todos){
            if(t.getId() == id ){
                return t;
            }
        }
        return null;
    }

    public Todo addTodo(Todo todo){
        todos.add(todo);
        return todo;
    }

}
