package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.AcademiaFavorita;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.AcademiaFavoritaId;

@Repository
public interface AcademiaFavoritaRepository extends JpaRepository<AcademiaFavorita, AcademiaFavoritaId>{

	List<AcademiaFavorita> findByIdusuario(Usuario u);
	

}
