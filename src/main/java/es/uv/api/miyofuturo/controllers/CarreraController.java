package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.Carrera;
import es.uv.api.miyofuturo.entities.Universidad;
import es.uv.api.miyofuturo.services.CarrerasService;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/carreras"})
public class CarreraController {
	

	@Autowired
	private CarrerasService carrerasService;
	
	@GetMapping
	public List<Carrera> getAllCarreras(){
		return carrerasService.getAllCarreras();
	}

	@GetMapping("/{idcarrera}")
	public Carrera getCarrera(@PathVariable("idcarrera") int idcarrera){
		return carrerasService.getCarrera(idcarrera);
	}


	@GetMapping({"/area"})
	public List<Carrera> getCarrerasByArea(@RequestParam("area") String area){
		return carrerasService.getCarrerasByArea(area);
	}
}
