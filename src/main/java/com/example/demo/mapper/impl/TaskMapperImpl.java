package com.example.demo.mapper.impl;

import com.example.demo.CreateTaskRequest;
import com.example.demo.DTO.CreatTaskRequestDTO;
import com.example.demo.DTO.TaskDto;
import com.example.demo.entity.Task;
import com.example.demo.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreatTaskRequestDTO dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );

    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDuedate(),
                task.getPriorty(),
                task.getState()
        );
    }
}
