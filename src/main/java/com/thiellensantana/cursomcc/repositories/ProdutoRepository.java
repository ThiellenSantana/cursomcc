package com.thiellensantana.cursomcc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiellensantana.cursomcc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer> {
	

}
