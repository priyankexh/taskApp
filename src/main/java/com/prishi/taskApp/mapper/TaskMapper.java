package com.prishi.taskApp.mapper;

import com.prishi.taskApp.domain.CreateTaskRequest;
import com.prishi.taskApp.domain.UpdateTaskRequest;
import com.prishi.taskApp.domain.dto.CreateTaskRequestDto;
import com.prishi.taskApp.domain.dto.TaskDto;
import com.prishi.taskApp.domain.dto.UpdateTaskRequestDto;
import com.prishi.taskApp.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);
    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);
    TaskDto toDto(Task task);

}
