package uz.pdp.dto;

import uz.pdp.entity.User;

public record UserResponse(Long id, String username, String email, String role) {
    public static UserResponse from(User u) {
        return new UserResponse(u.getId(), u.getUsername(), u.getEmail(), u.getRole().name());
    }
}
