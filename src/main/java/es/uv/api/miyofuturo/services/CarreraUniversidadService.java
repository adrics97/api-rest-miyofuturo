package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Carrera;
import es.uv.api.miyofuturo.entities.CarreraUniversidad;
import es.uv.api.miyofuturo.entities.Universidad;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.repositories.CarreraUniversidadRepository;
import es.uv.api.miyofuturo.repositories.CarrerasRepository;
import es.uv.api.miyofuturo.repositories.UniversidadesRepository;

@Service
public class CarreraUniversidadService {

	
	@Autowired
	private CarreraUniversidadRepository car_uniRepo;
	
	@Autowired
	private UniversidadesRepository uniRepo;
	
	@Autowired
	private CarrerasRepository carreraRepo;
	
	public List<CarreraUniversidad> getCarrerasByUniversidad(int iduniversidad) {
		Universidad uni = uniRepo.findById(iduniversidad).orElse(null);
		return car_uniRepo.findByIduniversidad(uni);
	}

	public List<CarreraUniversidad> getUniversidadesByCarrera(int idcarrera) {
		Carrera c = carreraRepo.findById(idcarrera).orElse(null);
		return car_uniRepo.findByIdcarrera(c);
	}

}
