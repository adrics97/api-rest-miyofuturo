package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.EventoFavorito;
import es.uv.api.miyofuturo.entities.Nota;
import es.uv.api.miyofuturo.services.EventosFavoritosService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/eventos/favoritos"})
public class EventoFavoritoController {

	@Autowired
	private EventosFavoritosService evefavService;
	
	@GetMapping
	public List<EventoFavorito> getFavoritos(){
		return evefavService.getFavoritos();
	}
	
	@GetMapping("/user")
	public List<EventoFavorito> getFavoritosByUser(@RequestParam("idusuario") int idusuario){
		return evefavService.getFavoritosByUser(idusuario);
	}
	
	@GetMapping("/evento")
	public EventoFavorito getFavorito(@RequestParam("idevento") int idevento, @RequestParam("idusuario") int idusuario){
		return evefavService.getFavorito(idevento, idusuario);
	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public EventoFavorito createEventoFavorito(@RequestBody EventoFavorito eveFav) {
		return evefavService.createEventoFavorito(eveFav);
	}
	
	@DeleteMapping
	public  void deleteEventoFavorito(@RequestParam("idevento") int idevento, @RequestParam("idusuario") int idusuario){
		evefavService.deleteEventoFavorito(idevento,idusuario);
	}
	
	
	@PutMapping
	public EventoFavorito updateEventoFavorito(@RequestParam("idevento") int idevento, @RequestParam("idusuario") int idusuario, @RequestBody EventoFavorito eveFav) {
		System.out.print("HE LLEGADO AQUI");
		return evefavService.updateEventoFavorito(idevento,idusuario, eveFav);
	}
}
