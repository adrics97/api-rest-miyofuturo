package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Universidad;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.repositories.UniversidadesRepository;

@Service
public class UniversidadesService {

	@Autowired 
	private UniversidadesRepository uniRepo;
	
	public List<Universidad> getAllUniversidades(){
		return uniRepo.findAll();
	}

	public List<Universidad> getUniversidadesByComunidad(String comunidad) {
		return uniRepo.findByComunidad(comunidad);
	}
	
	public List<Universidad> getUniversidadesByProvincia(String provincia) {
		return uniRepo.findByProvincia(provincia);
	}

	public Universidad getUniversidad(int iduniversidad) {
		return uniRepo.findById(iduniversidad).orElse(null);
	}
}
