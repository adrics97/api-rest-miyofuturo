package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.Carrera;
import es.uv.api.miyofuturo.entities.CarreraUniversidad;
import es.uv.api.miyofuturo.entities.Universidad;

import es.uv.api.miyofuturo.entities.Ids.CarreraUniversidadId;

@Repository
public interface CarreraUniversidadRepository  extends JpaRepository<CarreraUniversidad,CarreraUniversidadId>{

	List<CarreraUniversidad> findByIduniversidad(Universidad uni);
	
	List<CarreraUniversidad> findByIdcarrera(Carrera car);
}
