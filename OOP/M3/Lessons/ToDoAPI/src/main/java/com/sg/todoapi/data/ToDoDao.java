/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.todoapi.data;

import com.sg.todoapi.model.ToDo;
import java.util.List;

/**
 *
 * @author Qube
 */
//this interface defines our ToDo CRUD operations
public interface ToDoDao {

    public ToDo add(ToDo todo);

    public List<ToDo> getAll();

    public ToDo findById(int id);

    //true if item exists and is updated
    public boolean update(ToDo todo);

    //true if item exists and is deleted
    public boolean deleteById(int id);

}
