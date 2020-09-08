/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petros.todo.todomanagement.repository;

import com.petros.todo.todomanagement.model.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author petros_trak
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
    
    List<Todo> findByUserName(String name);
}
