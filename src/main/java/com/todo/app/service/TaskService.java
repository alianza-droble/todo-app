package com.todo.app.service;

import com.todo.app.entities.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    List<Task> listTasks();
    Task getTaskById(Long id);
    Task markTaskAsCompleted(Long id,String estado);
}
