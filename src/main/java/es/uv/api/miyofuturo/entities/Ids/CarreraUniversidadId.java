package es.uv.api.miyofuturo.entities.Ids;

import java.io.Serializable;

import es.uv.api.miyofuturo.entities.CarreraUniversidad;
import es.uv.api.miyofuturo.entities.Nota;

public class CarreraUniversidadId implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idcarrera;
	private Integer iduniversidad;
	
	public CarreraUniversidadId() {
		
	}

	public CarreraUniversidadId(Integer idcarrera, Integer iduniversidad) {
		super();
		this.idcarrera = idcarrera;
		this.iduniversidad = iduniversidad;
	}
	
	public int hashCode() {
		return idcarrera + String.valueOf(iduniversidad).hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof CarreraUniversidadId))
			return false;
		if (obj == null)
			return false;
		CarreraUniversidad carr_uni = (CarreraUniversidad) obj;
		return carr_uni.getIdcarrera().getIdcarrera() == idcarrera 
				&& carr_uni.getIduniversidad().getIduniversidad() == iduniversidad;
	}
	
}
