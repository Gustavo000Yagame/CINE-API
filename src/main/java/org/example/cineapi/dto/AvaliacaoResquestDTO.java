package org.example.cineapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AvaliacaoResquestDTO (
        @NotNull(message = "")
        Integer nota,

        @NotBlank(message = "")
        String comentario

){}
