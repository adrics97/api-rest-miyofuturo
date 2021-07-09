package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.Academia;
import es.uv.api.miyofuturo.entities.Evento;

@Repository
public interface AcademiaRepository extends JpaRepository<Academia, Integer>{

	public List<Academia> findByCiudad(String ciudad);
}
