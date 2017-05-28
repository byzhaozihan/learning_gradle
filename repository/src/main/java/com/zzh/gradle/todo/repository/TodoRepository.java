package com.zzh.gradle.todo.repository;


import com.zzh.gradle.todo.model.TodoItem;

import java.util.HashMap;
import java.util.Map;

public class TodoRepository {
    private static Map<String, TodoItem> items = new HashMap<>();


    public void save(TodoItem item) {
        System.out.println("" + item);
        items.put(item.getName(), item);
    }

    public TodoItem query(String name) {
        return items.get(name);
    }
}
