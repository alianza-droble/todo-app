package com.todo.app.service.impl;

import com.todo.app.entities.Task;
import com.todo.app.enumerator.TaskStatus;
import com.todo.app.exceptionHandler.exception.TaskNotFoundException;
import com.todo.app.respository.TaskRepository;
import com.todo.app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {


    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        task.setStatus(TaskStatus.PENDIENTE);
        return taskRepository.save(task);
    }

    @Override
    public List<Task> listTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException("Task not found"));
    }

    @Override
    public Task markTaskAsCompleted(Long id,String estado) {
        Task task = this.getTaskById(id);
        task.setStatus(TaskStatus.fromString(estado));
        return taskRepository.save(task);
    }
}
