package com.example.demo.service;

import com.example.demo.CreateTaskRequest;
import com.example.demo.entity.Task;

public interface TaskeService {
    Task createtask(CreateTaskRequest request);

}
