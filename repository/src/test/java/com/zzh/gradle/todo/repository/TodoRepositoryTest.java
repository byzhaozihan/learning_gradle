package com.zzh.gradle.todo.repository;

import com.zzh.gradle.todo.model.TodoItem;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class TodoRepositoryTest {

    private TodoRepository repository = new TodoRepository();

    @Test
    public void save() throws Exception {
        TodoItem item = new TodoItem("zzh");
        repository.save(item);
        Assert.assertNotNull(repository.query(item.getName()));
        //Assert.assertNull(repository.query(item.getName()));

    }

}