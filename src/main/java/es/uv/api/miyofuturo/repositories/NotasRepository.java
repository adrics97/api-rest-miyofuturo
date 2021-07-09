package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.Nota;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.NotaId;


@Repository
public interface NotasRepository extends JpaRepository<Nota, NotaId>{
	
	List<Nota> findByIdusuario(Usuario usuario);

	@Query("select n from Nota n where n.idusuario=?1 and "
			+ "(n.calificacion_1 between 0.1 and 4.9 or n.calificacion_2 between 0.1 and 4.9 or n.calificacion_3 between 0.1 and 4.9)")
	List<Nota> findNotasSuspendidas(Usuario usuario);

	@Query("select n from Nota n where n.idusuario=?1 and "
			+ "(n.calificacion_1 between 8.5 and 10 or n.calificacion_2 between 8.5 and 10 or n.calificacion_3 between 8.5 and 10)")
	List<Nota> findNotasSobresalientes(Usuario usuario);

}
