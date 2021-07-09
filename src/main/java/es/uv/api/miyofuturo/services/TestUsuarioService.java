package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.TestUsuario;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.repositories.TestUsuarioRepository;
import es.uv.api.miyofuturo.repositories.UsuariosRepository;

@Service
public class TestUsuarioService {

	@Autowired
	private TestUsuarioRepository testUsuRepo;
	
	@Autowired
	private UsuariosRepository usuariosRepo;
	
	public TestUsuario createTestUsuario(TestUsuario testUsu) {
		
		return testUsuRepo.save(testUsu);
	}

	public List<TestUsuario> getTestByIdusuario(int idusuario) {
		Usuario u = usuariosRepo.findById(idusuario).orElse(null);
		return testUsuRepo.findByIdusuario(u);
	}

}
