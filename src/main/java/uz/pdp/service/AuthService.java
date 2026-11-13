package uz.pdp.service;

import jakarta.validation.Valid;
import uz.pdp.dto.RegisterRequest;
import uz.pdp.dto.UserResponse;

public class AuthService {
    public UserResponse register(@Valid RegisterRequest req) {
        return null;
    }
}
