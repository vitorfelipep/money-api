package com.prj.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prj.money.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
}
