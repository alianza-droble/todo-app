package com.todo.app.exceptionHandler;

import com.todo.app.exceptionHandler.dto.GlobalErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<GlobalErrorResponseDTO> handleRuntimeException(RuntimeException ex) {
        return ResponseEntity.ok((new GlobalErrorResponseDTO(ex.getMessage(), HttpStatus.NOT_FOUND.value(), LocalDateTime.now())));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GlobalErrorResponseDTO> handleGenericException(Exception ex) {
        return ResponseEntity.ok(new GlobalErrorResponseDTO(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), LocalDateTime.now()));
    }
}
