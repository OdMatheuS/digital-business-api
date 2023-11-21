package br.com.plusoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.plusoft.entity.AtualizacaoSaudePub;

@Repository
public interface AtualizacaoSaudePubRepository extends JpaRepository<AtualizacaoSaudePub, Long> {

}
