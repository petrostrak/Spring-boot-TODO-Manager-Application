/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petros.todo.todomanagement.service;

import com.petros.todo.todomanagement.model.Todo;
import com.petros.todo.todomanagement.repository.TodoRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author petros_trak
 */

@Service
public class TodoServiceImpl implements ITodoService{
    
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional<Todo> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String name, String description, Date targetDate, boolean isDone) {
        todoRepository.save(new Todo(name, description, targetDate, isDone));
    }

    @Override
    public void deleteTodo(long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if(todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }
    
}
