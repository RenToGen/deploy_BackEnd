package com.generation.rento.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.rento.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
		
	public List<Produto> findAllBynomeServicoContainingIgnoreCase (String nomeServico);
		
	}
