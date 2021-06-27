package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.Nota;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.NotaId;


@Repository
public interface NotasRepository extends JpaRepository<Nota, NotaId>{
	
	List<Nota> findByIdusuario(Usuario usuario);

}
