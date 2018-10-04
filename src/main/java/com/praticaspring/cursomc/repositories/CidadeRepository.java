package com.praticaspring.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.praticaspring.cursomc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	@Transactional(readOnly=true)
//	@Query("SELECT obj FROM Cidade obj WHERE obj.estado.id = :estadId ORDER BY obj.nome")
//	public List<Cidade> findAllByEstadoId(@Param("estadoId")Integer estado_id);
	
	List<Cidade> findAllByEstadoId(Integer estadoId);
}
