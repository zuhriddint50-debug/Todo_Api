package uz.pdp.service;

import jakarta.validation.Valid;
import uz.pdp.dto.TodoRequest;
import uz.pdp.dto.TodoResponse;

import java.util.List;

public class TodoService {
    public TodoResponse create(String name, @Valid TodoRequest req) {
        return null;
    }

    public List<TodoResponse> list(String name) {
        return null;
    }

    public TodoResponse get(String name, Long id) {
        return null;
    }

    public TodoResponse update(String name, Long id, @Valid TodoRequest req) {
        return null;
    }

    public void delete(String name, Long id) {
        return;
    }
}
