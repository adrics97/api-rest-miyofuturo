package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.EventoFavorito;
import es.uv.api.miyofuturo.entities.EventoRecomendado;
import es.uv.api.miyofuturo.services.EventosFavoritosService;
import es.uv.api.miyofuturo.services.EventosRecomendadosService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/eventos/recomendados"})
public class EventoRecomendadoController {
	
	@Autowired
	private EventosRecomendadosService eveRecService;
	
	@GetMapping
	public List<EventoRecomendado> getEventosRecomendados(){
		return eveRecService.getEventosRecomendados();
	}
	

}
