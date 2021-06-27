package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Carrera;
import es.uv.api.miyofuturo.repositories.CarrerasRepository;

@Service
public class CarrerasService {
	
	@Autowired
	private CarrerasRepository carrerasRepo;

	public List<Carrera> getAllCarreras() {
		return carrerasRepo.findAll();
	}

	public List<Carrera> getCarrerasByArea(String area) {
		return carrerasRepo.findByArea(area);
	}

	public Carrera getCarrera(int idcarrera) {
		return carrerasRepo.findById(idcarrera).orElse(null);
	}

}
