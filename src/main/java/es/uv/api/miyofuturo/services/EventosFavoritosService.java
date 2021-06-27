package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Evento;
import es.uv.api.miyofuturo.entities.EventoFavorito;
import es.uv.api.miyofuturo.entities.Nota;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.EventoFavoritoId;
import es.uv.api.miyofuturo.repositories.EventosFavoritosRepository;
import es.uv.api.miyofuturo.repositories.EventosRepository;
import es.uv.api.miyofuturo.repositories.UsuariosRepository;

@Service
public class EventosFavoritosService {

	@Autowired
	private EventosFavoritosRepository evefavRepo;
	
	@Autowired
	private UsuariosRepository usuariosRepo;
	
	@Autowired
	private EventosRepository eventosRepo;
	
	public List<EventoFavorito> getFavoritos(){
		return evefavRepo.findAll();
	}
	
	public List<EventoFavorito> getFavoritosByUser(int idusuario){
		Usuario u = usuariosRepo.findById(idusuario).orElse(null);
		return evefavRepo.findByIdusuario(u);
	}

	public EventoFavorito createEventoFavorito(EventoFavorito eveFav) {
		return evefavRepo.save(eveFav);
	}

	public void deleteEventoFavorito(int idevento, int idusuario) {
		EventoFavoritoId evefavId = new EventoFavoritoId(idevento, idusuario);
		evefavRepo.deleteById(evefavId);
		
	}

	public EventoFavorito getFavorito(int idevento, int idusuario) {
		EventoFavoritoId evefavId = new EventoFavoritoId(idevento, idusuario);
		return evefavRepo.findById(evefavId).orElse(null);
	}

	public EventoFavorito updateEventoFavorito(int idevento, int idusuario, EventoFavorito eveFav) {
		EventoFavoritoId evefavId = new EventoFavoritoId(idevento, idusuario);
		EventoFavorito ef = evefavRepo.findById(evefavId).orElse(null);
		System.out.println(ef.getComentario());
		
		ef.setIdevento(eveFav.getIdevento());
		ef.setIdusuario(eveFav.getIdusuario());
		ef.setComentario(eveFav.getComentario());
		ef.setValoracion(eveFav.getValoracion());
		
		deleteEventoFavorito(idevento,idusuario);
		return evefavRepo.save(ef);
	}
	
	
}
