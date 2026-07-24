package com.prishi.taskApp.service;

import com.prishi.taskApp.domain.CreateTaskRequest;
import com.prishi.taskApp.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

}
