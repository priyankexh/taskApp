package com.prishi.taskApp.domain.dto;

import com.prishi.taskApp.domain.entity.TaskPriority;
import com.prishi.taskApp.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status

) {
}
