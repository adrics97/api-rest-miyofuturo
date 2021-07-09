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

import es.uv.api.miyofuturo.entities.AcademiaFavorita;
import es.uv.api.miyofuturo.entities.CarreraFavorita;
import es.uv.api.miyofuturo.services.AcademiaFavoritaService;
import es.uv.api.miyofuturo.services.CarreraFavoritaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/academias/favoritas"})
public class AcademiaFavoritaController {

	@Autowired
	private AcademiaFavoritaService acaFavService;
	
	@GetMapping("/user")
	public List<AcademiaFavorita> getAcademiasFavoritasByUser(@RequestParam("idusuario") int idusuario){
		return acaFavService.getAcademiasFavoritasByUser(idusuario);
	}
	
	@GetMapping("/academia")
	public AcademiaFavorita getAcademiaFavorita(@RequestParam("idacademia") int idacademia, @RequestParam("idusuario") int idusuario){
		return acaFavService.getAcademiaFavorita(idacademia, idusuario);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AcademiaFavorita createAcademiaFavorita(@RequestBody AcademiaFavorita acaFav) {
		return acaFavService.createAcademiaFavorita(acaFav);
	}
	
	@DeleteMapping
	public  void deleteAcademiaFavorita(@RequestParam("idacademia") int idacademia, @RequestParam("idusuario") int idusuario){
		acaFavService.deleteAcademiaFavorita(idacademia,idusuario);
	}
}
