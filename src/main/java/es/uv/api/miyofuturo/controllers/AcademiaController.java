package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.Academia;
import es.uv.api.miyofuturo.entities.Asignatura;
import es.uv.api.miyofuturo.entities.Evento;
import es.uv.api.miyofuturo.services.AcademiasService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/academias"})
public class AcademiaController {
	
	@Autowired
	AcademiasService acaService;

	@GetMapping
	public List<Academia> getAllAcademias(){
		return acaService.getAllAcademias();
	}
	
	
	@GetMapping({"/{idacademia}"})
	public Academia getAcademia(@PathVariable("idacademia") int idacademia){
		return acaService.getAcademia(idacademia);
	}
	
	
	@GetMapping({"/ciudad"})
	public List<Academia> getAcademiasByCity(@RequestParam("ciudad") String ciudad){
		return acaService.getAcademiasByCity(ciudad);
	}
	
	
	
}
