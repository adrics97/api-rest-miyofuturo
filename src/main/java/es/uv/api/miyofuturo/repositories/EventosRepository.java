package es.uv.api.miyofuturo.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.uv.api.miyofuturo.entities.Evento;

public interface EventosRepository extends JpaRepository<Evento, Integer>{
	
	public List<Evento> findByCiudad(String ciudad);

	@Query("select e"
			+ " from Evento e"
			+ " where e.fecha between ?1 and ?2")
	public List<Evento> findEventosCercanos(Date today, Date more);

}
