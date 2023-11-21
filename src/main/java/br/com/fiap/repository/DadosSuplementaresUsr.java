package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.entity.DadosSupleUsr;

@Repository
public interface DadosSuplementaresUsr extends JpaRepository<DadosSuplementaresUsr, Long> {

	DadosSupleUsr save(DadosSupleUsr dadosSupleUsr);

}
