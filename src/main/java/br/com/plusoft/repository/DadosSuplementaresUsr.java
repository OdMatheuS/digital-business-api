package br.com.plusoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosSuplementaresUsr extends JpaRepository<DadosSuplementaresUsr, Long> {

}
