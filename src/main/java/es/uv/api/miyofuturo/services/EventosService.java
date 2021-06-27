package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Evento;
import es.uv.api.miyofuturo.repositories.EventosRepository;

@Service
public class EventosService {
	
	@Autowired
	private EventosRepository eventosRepository;

	public List<Evento> getAllEventos() {
		return eventosRepository.findAll();
	}

	public Evento getEvento(int idevento) {	
		return eventosRepository.findById(idevento).orElse(null);
	}

	public List<Evento> getEventosByCity(String ciudad) {
		return eventosRepository.findByCiudad(ciudad);
	}


}
