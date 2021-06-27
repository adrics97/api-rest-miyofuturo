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

}
