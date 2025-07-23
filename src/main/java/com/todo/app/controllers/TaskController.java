package com.todo.app.controllers;

import com.todo.app.entities.Task;
import com.todo.app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.createTask(task));
    }

    @GetMapping
    public ResponseEntity<List<Task>> listTasks() {
        return ResponseEntity.ok(taskService.listTasks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @PutMapping("/{id}/{estado}/complete")
    public ResponseEntity<Task> markTaskAsCompleted(@PathVariable Long id,@PathVariable String estado) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(taskService.markTaskAsCompleted(task.getId(),estado));
    }
}
