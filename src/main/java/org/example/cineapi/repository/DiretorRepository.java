package org.example.cineapi.repository;

import org.example.cineapi.model.Avaliacao;
import org.example.cineapi.model.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiretorRepository extends JpaRepository<Diretor, Long> {


}
