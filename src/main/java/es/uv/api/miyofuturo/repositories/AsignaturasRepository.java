package es.uv.api.miyofuturo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.Asignatura;

@Repository
public interface AsignaturasRepository extends JpaRepository<Asignatura, Integer>{
	
	public Asignatura findByNombre(String nombre);

}
