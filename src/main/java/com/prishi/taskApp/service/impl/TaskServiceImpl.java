package com.prishi.taskApp.service.impl;

import com.prishi.taskApp.domain.CreateTaskRequest;
import com.prishi.taskApp.domain.UpdateTaskRequest;
import com.prishi.taskApp.domain.entity.Task;
import com.prishi.taskApp.domain.entity.TaskStatus;
import com.prishi.taskApp.exception.TaskNotFoundException;
import com.prishi.taskApp.repository.TaskRepository;
import com.prishi.taskApp.service.TaskService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Task> listTasks() {
       return taskRepository.findAll(Sort.by(Sort.Direction.ASC, "created"));
    }

    @Override
    public Task updateTask(UUID taskid, UpdateTaskRequest request) {
        Task task = taskRepository.findById(taskid).orElseThrow(() -> new TaskNotFoundException(taskid));
        task.setTitle(request.title());
        task.setDescription(request.description());
        task.setDueDate(request.dueDate());
        task.setStatus(request.status());
        task.setPriority(request.priority());
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(UUID taskid) {
        taskRepository.deleteById(taskid);

    }

}
