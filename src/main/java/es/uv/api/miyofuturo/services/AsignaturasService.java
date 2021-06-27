package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Asignatura;
import es.uv.api.miyofuturo.repositories.AsignaturasRepository;

@Service
public class AsignaturasService {
	
	@Autowired
	private AsignaturasRepository asignaturasRepo;
	
	
	public List<Asignatura> getAllAsignaturas(){
		return asignaturasRepo.findAll();
	}
	
	public Asignatura createAsignatura(Asignatura asig) {
		Asignatura asi = asignaturasRepo.saveAndFlush(asig);
		System.out.println("idasignatura: "+ asi.getIdasignatura());
		return asi;
	}
	
	public Asignatura getAsignatura(int id){
		return asignaturasRepo.findById(id).orElse(null);
	}
	
	public  void deleteAsignatura(int id){
		asignaturasRepo.deleteById(id);
	}

	public Asignatura getAsignaturaByNombre(String nombre) {
		return asignaturasRepo.findByNombre(nombre);
	}

}
