package uz.pdp.dto;

public record AuthResponse(String token, String tokenType, long expiresInMs) {}
