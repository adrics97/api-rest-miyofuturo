package es.uv.api.miyofuturo.entities.Ids;

import java.io.Serializable;

import es.uv.api.miyofuturo.entities.CarreraFavorita;
import es.uv.api.miyofuturo.entities.CarreraUniversidad;

public class CarreraFavoritaId implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idcarrera;
	private Integer idusuario;
	
	public CarreraFavoritaId() {
		
	}

	public CarreraFavoritaId(Integer idcarrera, Integer idusuario) {
		super();
		this.idcarrera = idcarrera;
		this.idusuario = idusuario;
	}
	
	public int hashCode() {
		return idcarrera + String.valueOf(idusuario).hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof CarreraFavoritaId))
			return false;
		if (obj == null)
			return false;
		CarreraFavorita carr_fav = (CarreraFavorita) obj;
		return carr_fav.getIdcarrera().getIdcarrera() == idcarrera 
				&& carr_fav.getIdusuario().getIdusuario() == idusuario;
	}
}
