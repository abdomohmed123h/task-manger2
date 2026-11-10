package com.example.demo.DTO;

import com.example.demo.entity.TaskestaTUS;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto (
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        com.example.demo.entity.Taskpriorty priorty, TaskestaTUS status
){
}
