package es.uv.api.miyofuturo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.EventoRecomendado;
import es.uv.api.miyofuturo.entities.Ids.EventoRecomendadoId;

@Repository
public interface EventosRecomendadosRepository extends JpaRepository<EventoRecomendado, EventoRecomendadoId >{

}
