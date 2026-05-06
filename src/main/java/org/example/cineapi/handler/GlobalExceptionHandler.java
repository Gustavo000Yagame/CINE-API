package org.example.cineapi.handler;

import org.example.cineapi.exception.RecursoNaoEncontradoException;
import org.example.cineapi.exception.RegraDeNegocioException;
import org.springframework.beans.MethodInvocationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GlobalExceptionHandler {
    @ExceptionHandler (MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> tratarValidacao(MethodArgumentNotValidException ex){
        Map<String, String> erros = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(
                erro -> erros.put(erro.getField(), erro.getDefaultMessage())
        );
        return ResponseEntity.badRequest().body(erros);
    }

    @ExceptionHandler (RecursoNaoEncontradoException.class)
    public ResponseEntity<Map<String, String>> tratarRecursoNãoEncontrado(RecursoNaoEncontradoException ex){
        Map<String, String> erro = new HashMap<>();

        erro.put("erro", ex.getMessage());

        return ResponseEntity.status(404).body(erro);
    }

    @ExceptionHandler (RegraDeNegocioException.class)
    public ResponseEntity<Map<String, String>> tratarRegraDeNegocio(RegraDeNegocioException ex){
        Map<String, String> erro = new HashMap<>();

        erro.put("erro", ex.getMessage());

        return ResponseEntity.badRequest().body(erro);
    }


}