package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.PreguntaTest;

import es.uv.api.miyofuturo.services.PreguntaTestService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/preguntastest"})
public class PreguntaTestController {
	

	@Autowired
	private PreguntaTestService preTestService;
	
	
	@GetMapping
	public List<PreguntaTest> getAllPreguntasByTest(@RequestParam("idtest") int idtest){
		return preTestService.getAllPreguntasByTest(idtest);
	}
}
