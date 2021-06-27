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
import es.uv.api.miyofuturo.entities.Universidad;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.services.UniversidadesService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/universidades"})
public class UniversidadController {
	
	@Autowired
	private UniversidadesService uniService;
	
	@GetMapping
	public List<Universidad> getAllUniversidades(){
		return uniService.getAllUniversidades();
	}
	
	@GetMapping("/{iduniversidad}")
	public Universidad getUniversidad(@PathVariable("iduniversidad") int iduniversidad){
		return uniService.getUniversidad(iduniversidad);
	}
	

	@GetMapping({"/comunidad"})
	public List<Universidad> getUniversidadesByComunidad(@RequestParam("comunidad") String comunidad){
		return uniService.getUniversidadesByComunidad(comunidad);
	}
	

	@GetMapping({"/provincia"})
	public List<Universidad> getUniversidadesByProvincia(@RequestParam("provincia") String provincia){
		return uniService.getUniversidadesByProvincia(provincia);
	}
}
