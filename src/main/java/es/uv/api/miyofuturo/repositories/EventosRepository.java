package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uv.api.miyofuturo.entities.Evento;

public interface EventosRepository extends JpaRepository<Evento, Integer>{
	
	public List<Evento> findByCiudad(String ciudad);

}
