package com.prishi.taskApp.service;

import com.prishi.taskApp.domain.CreateTaskRequest;
import com.prishi.taskApp.domain.UpdateTaskRequest;
import com.prishi.taskApp.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    Task createTask(CreateTaskRequest request);
    List<Task> listTasks();
    Task updateTask(UUID taskid, UpdateTaskRequest request);
    void deleteTask(UUID taskid);
}
