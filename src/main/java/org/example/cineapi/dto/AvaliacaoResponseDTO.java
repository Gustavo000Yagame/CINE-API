package org.example.cineapi.dto;

public record AvaliacaoResponseDTO (
        Long idAvalicao,
        Integer nota,
        String comentario,
        Long idFilme,
        String titulo

){}
