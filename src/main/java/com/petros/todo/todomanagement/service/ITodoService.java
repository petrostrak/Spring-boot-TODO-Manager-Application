/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petros.todo.todomanagement.service;

import com.petros.todo.todomanagement.model.Todo;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author petros_trak
 */
public interface ITodoService {
    
    List<Todo> getTodosByUser(String name);
    
    Optional<Todo> getTodoById(long id);
    
    void updateTodo(Todo todo);
    
    void addTodo(String name, String description, Date targetDate, boolean isDone);
    
    void deleteTodo(long id);
    
    void saveTodo(Todo todo);
    
}
