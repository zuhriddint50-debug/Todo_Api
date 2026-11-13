package uz.pdp.dto;

import uz.pdp.entity.Todo;

import java.time.LocalDateTime;

public record TodoResponse(Long id, String title, String description, boolean completed, LocalDateTime createdAt) {
    public static TodoResponse from(Todo t) {
        return new TodoResponse();
    }
}
