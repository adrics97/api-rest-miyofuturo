package es.uv.api.miyofuturo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uv.api.miyofuturo.entities.Ids.AcademiaFavoritaId;
import es.uv.api.miyofuturo.entities.Ids.CarreraFavoritaId;

@Entity
@IdClass(AcademiaFavoritaId.class)
@Table(name = "academia_favorita")
public class AcademiaFavorita {

	@Id
	@ManyToOne
	@JoinColumn(name ="idacademia")
	private Academia idacademia;
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idusuario")
	private Usuario idusuario;
	
	public AcademiaFavorita() {
		
	}

	public AcademiaFavorita(Academia idacademia, Usuario idusuario) {
		super();
		this.idacademia = idacademia;
		this.idusuario = idusuario;
	}

	public Academia getIdacademia() {
		return idacademia;
	}

	public void setIdacademia(Academia idacademia) {
		this.idacademia = idacademia;
	}

	public Usuario getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario) {
		this.idusuario = idusuario;
	}
	
	
}
