package com.example.demo.controller;

import com.example.demo.CreateTaskRequest;
import com.example.demo.DTO.CreatTaskRequestDTO;
import com.example.demo.DTO.TaskDto;
import com.example.demo.entity.Task;
import com.example.demo.mapper.TaskMapper;
import com.example.demo.service.TaskeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {

    private final TaskeService taskeService;
    private final TaskMapper taskMapper;

    public TaskController(TaskeService taskeService, TaskMapper taskMapper) {
        this.taskeService = taskeService;
        this.taskMapper = taskMapper;
    }

    @PostMapping
    public ResponseEntity<TaskDto> creatTask(
            @Valid @RequestBody CreatTaskRequestDTO creatTaskRequestDTO
    ) {
        CreateTaskRequest createTaskRequest = taskMapper.fromDto(creatTaskRequestDTO);
        Task task = taskeService.createtask(createTaskRequest);
        TaskDto createdTaskDto = taskMapper.toDto(task);
        return new ResponseEntity<>(createdTaskDto, HttpStatus.CREATED);
    }
}