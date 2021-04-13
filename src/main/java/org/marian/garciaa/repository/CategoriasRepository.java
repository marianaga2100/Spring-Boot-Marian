package org.marian.garciaa.repository;

import org.marian.garciaa.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

	
}
