package org.example.cineapi.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AvaliacaoResquestDTO (
        @NotNull(message = "Digite a nota!")
        @Min(value = 0, message = "Nota MIN e 0")
        @Max(value = 5, message = "Nota MAX e 5")
        Integer nota,

        @NotBlank(message = "Escreva o comentario")
        String comentario,

        @NotNull(message = "Digite o ID do filme")
        Long idFilme


){}
