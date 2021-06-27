package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.Universidad;

@Repository
public interface UniversidadesRepository extends JpaRepository<Universidad, Integer>{
	
	public List<Universidad> findByComunidad(String comunidad);

	public List<Universidad> findByProvincia(String provincia);

}
