package com.prishi.taskApp.mapper;

import com.prishi.taskApp.domain.CreateTaskRequest;
import com.prishi.taskApp.domain.dto.CreateTaskRequestDto;
import com.prishi.taskApp.domain.dto.TaskDto;
import com.prishi.taskApp.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    TaskDto toDto(Task task);

}
