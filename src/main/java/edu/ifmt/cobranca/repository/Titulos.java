package edu.ifmt.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ifmt.cobranca.model.Titulo;

// O Spring Data JPA já traz save, delete, findAll etc. prontos
public interface Titulos extends JpaRepository<Titulo, Long> {
}