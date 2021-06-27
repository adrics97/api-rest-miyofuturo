package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.repositories.UsuariosRepository;

@Service
public class UsuariosService {

	
	@Autowired
	private UsuariosRepository usuariosRepo;
	
	
	public List<Usuario> getAllUsuarios(){
		return usuariosRepo.findAll();
	}
	
	public Usuario createUsuario(Usuario user) {
		return usuariosRepo.save(user);
	}
	
	public Usuario getUser(int id){
		return usuariosRepo.findById(id).orElse(null);
	}
	
	public  void deleteUser(int id){
		usuariosRepo.deleteById(id);
	}

	public Usuario getUserByEmail(String email) {
		return usuariosRepo.findByEmail(email);
	}

	public Usuario updateUser(int idusuario, Usuario usuario) {
		usuariosRepo.updateUser(idusuario, usuario.getEmail(), usuario.getNombre(),
				usuario.getApellidos(), usuario.getTelefono(), usuario.getCiudad(), usuario.getDireccion(), usuario.getCurso(), usuario.getInstituto());
		return usuariosRepo.findById(idusuario).orElse(null);
	}
}
