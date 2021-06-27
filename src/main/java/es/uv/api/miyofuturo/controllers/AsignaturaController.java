package es.uv.api.miyofuturo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.Asignatura;
import es.uv.api.miyofuturo.services.AsignaturasService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/asignaturas"})
public class AsignaturaController {
	
	@Autowired
	private AsignaturasService asignaturasService;
	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Asignatura createUsuario(@RequestBody Asignatura asig){
		return asignaturasService.createAsignatura(asig);
	}
	
	@GetMapping
	public List<Asignatura> getAllUsuarios(){
		return asignaturasService.getAllAsignaturas();
	}
	
	@GetMapping("/{id}")
	public Asignatura getAsignatura(@PathVariable("id") int idasig){
		return asignaturasService.getAsignatura(idasig);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteAsignatura(@PathVariable("id") int idasig){
		asignaturasService.deleteAsignatura(idasig);
		
	}
	
	@GetMapping("/asignatura")
	public Asignatura getAsignaturaByNombre(@RequestParam("nombre") String nombre){
		return asignaturasService.getAsignaturaByNombre(nombre);
		
	}

}
