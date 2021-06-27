package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.Carrera;
import es.uv.api.miyofuturo.entities.CarreraFavorita;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.CarreraFavoritaId;

@Repository
public interface CarrerasFavoritasRepository extends JpaRepository<CarreraFavorita,CarreraFavoritaId>{

	public List<CarreraFavorita> findByIdusuario(Usuario user);
}
