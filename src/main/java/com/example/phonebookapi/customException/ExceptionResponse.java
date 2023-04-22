package com.example.phonebookapi.customException;

import java.time.LocalDateTime;

public record ExceptionResponse(LocalDateTime timestamp,
                                String message,
                                String details) {

    public String getDefaultMessage() {
        String[] parts = details.split("default message \\[");
        if (parts.length >= 2) {
            return parts[2].split("]")[0];
        }
        return null;
    }
}


