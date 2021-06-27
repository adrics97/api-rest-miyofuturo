package es.uv.api.miyofuturo.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.uv.api.miyofuturo.entities.Nota;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.services.UsuariosService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/usuarios"})
public class UsuarioController {
	
	
	@Autowired
	private UsuariosService usuariosService;
	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario createUsuario(@RequestBody Usuario user){
		return usuariosService.createUsuario(user);
	}
	
	@GetMapping
	public List<Usuario> getAllUsuarios(){
		return usuariosService.getAllUsuarios();
	}
	
	@GetMapping("/{id}")
	public Usuario getUser(@PathVariable("id") int idusuario){
		return usuariosService.getUser(idusuario);
		
	}
	
	@GetMapping("/usuario")
	public Usuario getUser(@RequestParam("email") String email){
		return usuariosService.getUserByEmail(email);
		
	}
	
	@PutMapping
	public Usuario updateUser(@RequestParam("idusuario") int idusuario, @RequestBody Usuario usuario) {
		System.out.print("HE LLEGADO AQUI");
		return usuariosService.updateUser(idusuario, usuario);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") int idusuario){
		usuariosService.deleteUser(idusuario);
		
	}
	
	

}
