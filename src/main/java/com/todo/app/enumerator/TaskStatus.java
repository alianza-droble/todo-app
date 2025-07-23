package com.todo.app.enumerator;

import com.todo.app.exceptionHandler.exception.StatusNotFoundException;

import java.util.stream.Stream;

public enum TaskStatus {
    PENDIENTE,
    COMPLETADA,
    DOCUMENTADA,
    REVISADA_POR_PARES;

    public static TaskStatus fromString(String status) {
        return Stream.of(values()).filter(e -> e.name().toUpperCase().equals(status))
                .findFirst()
                .orElseThrow(() -> new StatusNotFoundException("Unknown status: " + status));
    }
}
