package com.example.demo.DTO;

import com.example.demo.entity.Taskpriorty;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record CreatTaskRequestDTO(
        @NotBlank(message = CreatTaskRequestDTO.ERROR_MESSAGE_TITLE_LENGTH)
        @Size(max = 255, message = CreatTaskRequestDTO.ERROR_MESSAGE_TITLE_LENGTH)
        String title,
        @Size(max = 1000 , message =CreatTaskRequestDTO.ERROR_MESSAGE_DESCIPIION_LENGTH )
        @Nullable
        String description,
        @FutureOrPresent(message =CreatTaskRequestDTO.ERROR_MESSAGE_DUE_DATE_FUTURE )
        @Nullable
        LocalDate dueDate,
        @NotNull(message = ERROR_MESSAGE_PRIORITY)
        Taskpriorty priority
) {
     private static final String ERROR_MESSAGE_TITLE_LENGTH = "Title must be between 1 and 255 characters";
     private static final String ERROR_MESSAGE_DESCIPIION_LENGTH= "Description must be less then 1000 characters";
     private static final String ERROR_MESSAGE_DUE_DATE_FUTURE = "Due date must be in  the future";
     private static final String ERROR_MESSAGE_PRIORITY= "task priority must be provided";
}