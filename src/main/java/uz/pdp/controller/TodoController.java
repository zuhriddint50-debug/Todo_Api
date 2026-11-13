package uz.pdp.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.dto.TodoRequest;
import uz.pdp.dto.TodoResponse;
import uz.pdp.service.TodoService;

import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) { this.service = service; }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoResponse create(Principal p, @Valid @RequestBody TodoRequest req) {
        return service.create(p.getName(), req);
    }

    @GetMapping
    public List<TodoResponse> list(Principal p) {
        return service.list(p.getName());
    }

    @GetMapping("/{id}")
    public TodoResponse get(Principal p, @PathVariable Long id) {
        return service.get(p.getName(), id);
    }

    @PutMapping("/{id}")
    public TodoResponse update(Principal p, @PathVariable Long id, @Valid @RequestBody TodoRequest req) {
        return service.update(p.getName(), id, req);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Principal p, @PathVariable Long id) {
        service.delete(p.getName(), id);
    }
}
