package es.uv.api.miyofuturo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uv.api.miyofuturo.entities.Ids.CarreraFavoritaId;

@Entity
@IdClass(CarreraFavoritaId.class)
@Table(name = "carrera_favorita")
public class CarreraFavorita {

	@Id
	@ManyToOne
	@JoinColumn(name ="idcarrera")
	private Carrera idcarrera;
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idusuario")
	private Usuario idusuario;
	
	
	public CarreraFavorita() {
		
	}
	
	public CarreraFavorita(Carrera idcarrera, Usuario idusuario) {
		super();
		this.idcarrera = idcarrera;
		this.idusuario = idusuario;
	}

	public Carrera getIdcarrera() {
		return idcarrera;
	}

	public void setIdcarrera(Carrera idcarrera) {
		this.idcarrera = idcarrera;
	}

	public Usuario getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario) {
		this.idusuario = idusuario;
	}
	
	
}
