package es.uv.api.miyofuturo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.uv.api.miyofuturo.entities.Usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Integer>{
	
	public Usuario findByEmail(String email);


	@Transactional
	@Modifying
	@Query("UPDATE Usuario u"
			+ " SET u.email=?2 , u.nombre=?3, u.apellidos=?4, u.telefono=?5, "
			+ " u.ciudad=?6, u.direccion=?7, u.curso=?8, u.instituto=?9"
			+ " WHERE u.idusuario=?1")
	public void updateUser(int idusuario, String email, String nombre, String apellidos, int telefono, String ciudad, String direccion, String curso, String instituto );
}
