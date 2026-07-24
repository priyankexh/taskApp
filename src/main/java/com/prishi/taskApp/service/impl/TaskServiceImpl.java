package com.prishi.taskApp.service.impl;

import com.prishi.taskApp.domain.CreateTaskRequest;
import com.prishi.taskApp.domain.entity.Task;
import com.prishi.taskApp.domain.entity.TaskStatus;
import com.prishi.taskApp.repository.TaskRepository;
import com.prishi.taskApp.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();
        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now
        );

        return taskRepository.save(task);
    }

}
