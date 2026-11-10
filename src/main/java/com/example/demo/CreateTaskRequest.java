package com.example.demo;

import com.example.demo.entity.Taskpriorty;

import java.time.LocalDate;

public record CreateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        Taskpriorty taskpriorty
) {


}
