package com.thiellensantana.cursomcc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiellensantana.cursomcc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository <Cidade, Integer> {
	

}
