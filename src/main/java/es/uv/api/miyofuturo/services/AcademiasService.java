package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Academia;
import es.uv.api.miyofuturo.repositories.AcademiaRepository;

@Service
public class AcademiasService {

	@Autowired
	private AcademiaRepository acaRepo;
	
	public List<Academia> getAllAcademias() {
		return acaRepo.findAll();
	}

	public List<Academia> getAcademiasByCity(String ciudad) {
		return acaRepo.findByCiudad(ciudad);
	}

	public Academia getAcademia(int idacademia) {
		return acaRepo.findById(idacademia).orElse(null);
	}

}
