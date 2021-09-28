package es.uv.api.miyofuturo.services;

import java.util.List;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Nota;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.NotaId;
import es.uv.api.miyofuturo.repositories.NotasRepository;
import es.uv.api.miyofuturo.repositories.UsuariosRepository;

@Service
public class NotasService {

	
	@Autowired
	private NotasRepository notasRepo;
	
	@Autowired
	private UsuariosRepository usuariosRepo;
	
	
	public List<Nota> getAllNotas(){
		return notasRepo.findAll();
	}
	
	public Nota createNota(@Valid Nota nota) {
		return notasRepo.save(nota);
	}
	
	public Nota getNota(int iduser, int idasig){
		NotaId notaId = new NotaId(iduser, idasig);
		return notasRepo.findById(notaId).orElse(null);
	}
	
	public  void deleteNota(int iduser, int idasig){
		NotaId notaId = new NotaId(iduser, idasig);
		System.out.print("HE lleago aqui");
		notasRepo.deleteById(notaId);
	}

	public List<Nota> getNotasByIdusuario(int idusuario) {
		Usuario usuario = usuariosRepo.findById(idusuario).orElse(null);
		return notasRepo.findByIdusuario(usuario);
	}

	public Nota updateNota(int idusuario, int idasignatura, Nota update) {
		NotaId notaId = new NotaId(idusuario, idasignatura);
		Nota nota = notasRepo.findById(notaId).orElse(null);
		
		//nota.setIdusuario(update.getIdusuario());
		//nota.setIdasignatura(update.getIdasignatura());
		nota.setCalificacion_1(update.getCalificacion_1());
		nota.setCalificacion_2(update.getCalificacion_2());
		nota.setCalificacion_3(update.getCalificacion_3());
		
		deleteNota(idusuario, idasignatura);
		return notasRepo.save(nota);
	}

	public List<Nota> getNotasSuspendidasByIdusuario(int idusuario) {
		Usuario usuario = usuariosRepo.findById(idusuario).orElse(null);
		return notasRepo.findNotasSuspendidas(usuario);
	}

	public List<Nota> getNotasSobresalientesByIdusuario(int idusuario) {
		Usuario usuario = usuariosRepo.findById(idusuario).orElse(null);
		return notasRepo.findNotasSobresalientes(usuario);
	}
}
