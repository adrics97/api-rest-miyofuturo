package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uv.api.miyofuturo.entities.TestUsuario;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.TestUsuarioId;

@Repository
public interface TestUsuarioRepository extends JpaRepository<TestUsuario, TestUsuarioId>{

	List<TestUsuario> findByIdusuario(Usuario u);

}
