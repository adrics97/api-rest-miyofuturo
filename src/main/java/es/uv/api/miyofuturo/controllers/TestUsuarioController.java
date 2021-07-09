package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.Nota;
import es.uv.api.miyofuturo.entities.TestUsuario;

import es.uv.api.miyofuturo.services.TestUsuarioService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/testusuario"})
public class TestUsuarioController {


	@Autowired
	private TestUsuarioService testUsuService;
	

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public TestUsuario createTestUsuario(@RequestBody TestUsuario testUsu) {
		return testUsuService.createTestUsuario(testUsu);
	}
	
	
	@GetMapping({"/user"})
	public List<TestUsuario> getTestByIdusuario(@RequestParam("idusuario") int idusuario){
		return testUsuService.getTestByIdusuario(idusuario);
	}
}
