package uz.pdp.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

public record TodoRequest(){
        @NotBlank
        @Max
        String title;
       @Max
        String description,
        Boolean completed;
}