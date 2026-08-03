package com.prishi.taskApp.domain;

import com.prishi.taskApp.domain.entity.TaskPriority;
import com.prishi.taskApp.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(String title,
                                String description,
                                LocalDate dueDate,
                                TaskStatus status,
                                TaskPriority priority) {

}
