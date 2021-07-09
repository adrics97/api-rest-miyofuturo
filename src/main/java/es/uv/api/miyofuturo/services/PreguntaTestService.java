package es.uv.api.miyofuturo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.PreguntaTest;
import es.uv.api.miyofuturo.entities.Test;
import es.uv.api.miyofuturo.repositories.PreguntasTestRepository;
import es.uv.api.miyofuturo.repositories.TestRepository;

@Service
public class PreguntaTestService {
	
	@Autowired
	private PreguntasTestRepository preTestRepo;
	
	@Autowired
	private TestRepository testRepo;

	public List<PreguntaTest> getAllPreguntasByTest(int idtest) {
		Test t = testRepo.findById(idtest).orElse(null);
		return preTestRepo.findByIdtest(t);
	}

}
