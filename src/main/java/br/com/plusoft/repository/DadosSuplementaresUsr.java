package br.com.plusoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.plusoft.entity.DadosSupleUsr;

@Repository
public interface DadosSuplementaresUsr extends JpaRepository<DadosSuplementaresUsr, Long> {

	DadosSupleUsr save(DadosSupleUsr dadosSupleUsr);

}
