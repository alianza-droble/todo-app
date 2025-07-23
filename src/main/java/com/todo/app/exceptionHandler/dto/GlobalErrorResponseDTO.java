package com.todo.app.exceptionHandler.dto;

import java.time.LocalDateTime;

public record GlobalErrorResponseDTO(
        String message,
        int statusCode,
        LocalDateTime timestamp
) {}