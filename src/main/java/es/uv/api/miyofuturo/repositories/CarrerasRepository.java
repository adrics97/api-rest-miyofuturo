package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.Carrera;

@Repository
public interface CarrerasRepository extends JpaRepository<Carrera,Integer>{
	
	public List<Carrera> findByArea(String area);
}
