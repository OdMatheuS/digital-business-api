package br.com.plusoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.plusoft.entity.InfoSaudeUsr;

@Repository
public interface InfosSaudeUsrRepository extends JpaRepository<InfoSaudeUsr, Long> {

}
