package br.com.plusoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuvidasUsr extends JpaRepository<DuvidasUsr, Long> {

}
