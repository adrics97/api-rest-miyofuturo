package es.uv.api.miyofuturo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uv.api.miyofuturo.entities.EventoRecomendado;
import es.uv.api.miyofuturo.entities.Ids.EventoRecomendadoId;

public interface EventosRecomendadosRepository extends JpaRepository<EventoRecomendado, EventoRecomendadoId >{

}
