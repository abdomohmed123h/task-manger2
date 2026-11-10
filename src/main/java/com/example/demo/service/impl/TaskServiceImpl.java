package com.example.demo.service.impl;

import com.example.demo.CreateTaskRequest;
import com.example.demo.entity.Task;
import com.example.demo.entity.TaskestaTUS;

import com.example.demo.repository.TaskRepoitry;
import com.example.demo.service.TaskeService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskeService {
    private  final TaskRepoitry taskRepoitry;
     public TaskServiceImpl( TaskRepoitry taskRepoitry){
         this.taskRepoitry=taskRepoitry;
     }
    @Override
    public Task createtask(CreateTaskRequest request) {
        Instant instant= Instant.now();
         Task task = new Task(
                 null,
                 request.title(),
                 request.description(),
                 request.dueDate(),
                 TaskestaTUS.open,
                 request.taskpriorty(),
                 instant,
                 instant

                 );
         return taskRepoitry.save(task);
    }
}
