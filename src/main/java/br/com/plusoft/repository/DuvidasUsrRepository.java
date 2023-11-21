package br.com.plusoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.plusoft.entity.DuvidasUsr;

@Repository
public interface DuvidasUsrRepository extends JpaRepository<DuvidasUsr, Long> {

}
