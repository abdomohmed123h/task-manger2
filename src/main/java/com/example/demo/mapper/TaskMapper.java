package com.example.demo.mapper;

import com.example.demo.CreateTaskRequest;
import com.example.demo.DTO.CreatTaskRequestDTO;
import com.example.demo.DTO.TaskDto;
import com.example.demo.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreatTaskRequestDTO dto);
    TaskDto toDto(Task task);

}
