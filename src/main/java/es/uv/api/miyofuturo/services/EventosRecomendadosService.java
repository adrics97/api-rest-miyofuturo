package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.EventoRecomendado;
import es.uv.api.miyofuturo.repositories.EventosFavoritosRepository;
import es.uv.api.miyofuturo.repositories.EventosRecomendadosRepository;
import es.uv.api.miyofuturo.repositories.EventosRepository;

@Service
public class EventosRecomendadosService {
	
	@Autowired
	private EventosRecomendadosRepository eveRecRepo;
	
	@Autowired
	private EventosRepository eventosRepo;

	public List<EventoRecomendado> getEventosRecomendados() {
		return eveRecRepo.findAll();
	}
	
	

}
