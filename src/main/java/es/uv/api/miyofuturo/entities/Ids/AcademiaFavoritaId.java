package es.uv.api.miyofuturo.entities.Ids;

import java.io.Serializable;

import es.uv.api.miyofuturo.entities.AcademiaFavorita;
import es.uv.api.miyofuturo.entities.CarreraFavorita;

public class AcademiaFavoritaId implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idacademia;
	private Integer idusuario;
	
	public AcademiaFavoritaId() {
		
	}

	public AcademiaFavoritaId(Integer idacademia, Integer idusuario) {
		super();
		this.idacademia = idacademia;
		this.idusuario = idusuario;
	}
	
	public int hashCode() {
		return idacademia + String.valueOf(idusuario).hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof AcademiaFavoritaId))
			return false;
		if (obj == null)
			return false;
		AcademiaFavorita aca_fav = (AcademiaFavorita) obj;
		return aca_fav.getIdacademia().getIdacademia() == idacademia 
				&& aca_fav.getIdusuario().getIdusuario() == idusuario;
	}
	
	
}
