package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.CarreraUniversidad;
import es.uv.api.miyofuturo.entities.Nota;
import es.uv.api.miyofuturo.entities.Universidad;
import es.uv.api.miyofuturo.services.CarreraUniversidadService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class CarreraUniversidadController {
	
	@Autowired
	CarreraUniversidadService car_uniService;
	
	@GetMapping({"/carreras/universidad"})
	public List<CarreraUniversidad> getCarrerasByUniversidad(@RequestParam("iduniversidad") int iduniversidad){
		return car_uniService.getCarrerasByUniversidad(iduniversidad);
	}

	
	@GetMapping({"/universidades/carrera"})
	public List<CarreraUniversidad> getUniversidadesByCarrera(@RequestParam("idcarrera") int idcarrera){
		return car_uniService.getUniversidadesByCarrera(idcarrera);
	}
	
}
