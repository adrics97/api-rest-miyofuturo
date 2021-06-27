package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.Evento;
import es.uv.api.miyofuturo.services.EventosService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/eventos"})
public class EventoController {

	@Autowired
	private EventosService eventosService;
	
	@GetMapping
	public List<Evento> getAllEventos(){
		return eventosService.getAllEventos();
	}
	
	@GetMapping("/{idevento}")
	public Evento getEvento(@PathVariable("idevento") int idevento){
		return eventosService.getEvento(idevento);
	}
	
	@GetMapping({"/ciudad"})
	public List<Evento> getEventosByCity(@RequestParam("ciudad") String ciudad){
		return eventosService.getEventosByCity(ciudad);
	}
	
}
