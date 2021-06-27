package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.CarreraFavorita;
import es.uv.api.miyofuturo.entities.EventoFavorito;
import es.uv.api.miyofuturo.services.CarreraFavoritaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/carreras/favoritas"})
public class CarreaFavoritaController {

	@Autowired
	private CarreraFavoritaService carFavService;
	
	@GetMapping("/user")
	public List<CarreraFavorita> getCarrerasFavoritasByUser(@RequestParam("idusuario") int idusuario){
		return carFavService.getCarrerasFavoritasByUser(idusuario);
	}
	
	@GetMapping("/carrera")
	public CarreraFavorita getCarreraFavorita(@RequestParam("idcarrera") int idcarrera, @RequestParam("idusuario") int idusuario){
		return carFavService.getCarreraFavorita(idcarrera, idusuario);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CarreraFavorita createCarreraFavorita(@RequestBody CarreraFavorita carFav) {
		return carFavService.createEventoFavorito(carFav);
	}
	
	@DeleteMapping
	public  void deleteCarreraFavorita(@RequestParam("idcarrera") int idcarrera, @RequestParam("idusuario") int idusuario){
		carFavService.deleteCarreraFavorita(idcarrera,idusuario);
	}
}
