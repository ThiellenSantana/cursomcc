package com.thiellensantana.cursomcc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiellensantana.cursomcc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer> {
	

}
