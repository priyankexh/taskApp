package com.prishi.taskApp.mapper.impl;

import com.prishi.taskApp.domain.CreateTaskRequest;
import com.prishi.taskApp.domain.dto.CreateTaskRequestDto;
import com.prishi.taskApp.domain.dto.TaskDto;
import com.prishi.taskApp.domain.entity.Task;
import com.prishi.taskApp.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
