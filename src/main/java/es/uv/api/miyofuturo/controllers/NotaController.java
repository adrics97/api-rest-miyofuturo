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

import es.uv.api.miyofuturo.entities.Nota;
import es.uv.api.miyofuturo.entities.Ids.NotaId;
import es.uv.api.miyofuturo.services.NotasService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/notas"})
public class NotaController {

	@Autowired
	private NotasService notasService;
	
	
	@GetMapping
	public List<Nota> getAllNotas(){
		return notasService.getAllNotas();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Nota createNota(@RequestBody Nota nota) {
		nota.print();
		return notasService.createNota(nota);
	}
	
	@GetMapping({"/user"})
	public List<Nota> getNotasByIdusuario(@RequestParam("idusuario") int idusuario){
		return notasService.getNotasByIdusuario(idusuario);
	}
	
	@GetMapping({"/suspendidas"})
	public List<Nota> getNotasSuspendidasByIdusuario(@RequestParam("idusuario") int idusuario){
		return notasService.getNotasSuspendidasByIdusuario(idusuario);
	}
	

	@GetMapping({"/sobresalientes"})
	public List<Nota> getNotasSobresalientesByIdusuario(@RequestParam("idusuario") int idusuario){
		return notasService.getNotasSobresalientesByIdusuario(idusuario);
	}
	
	
	@GetMapping("/nota")
	public Nota getNota(@RequestParam("idusuario") int idusuario, @RequestParam("idasignatura") int idasignatura){
		return notasService.getNota(idusuario,idasignatura);
	}
	
	@PutMapping
	public Nota updateNota(@RequestParam("idusuario") int idusuario, @RequestParam("idasignatura") int idasignatura, @RequestBody Nota update) {
		System.out.print("HE LLEGADO AQUI");
		return notasService.updateNota(idusuario,idasignatura, update);
	}
	
	@DeleteMapping
	public  void deleteNota(@RequestParam("idusuario") int idusuario, @RequestParam("idasignatura") int idasignatura){
		notasService.deleteNota(idusuario,idasignatura);
	}
}
