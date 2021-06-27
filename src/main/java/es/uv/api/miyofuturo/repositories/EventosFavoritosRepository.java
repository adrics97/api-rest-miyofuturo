package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uv.api.miyofuturo.entities.EventoFavorito;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.EventoFavoritoId;

public interface EventosFavoritosRepository extends JpaRepository<EventoFavorito, EventoFavoritoId>{

	List<EventoFavorito> findByIdusuario(Usuario u);

}
