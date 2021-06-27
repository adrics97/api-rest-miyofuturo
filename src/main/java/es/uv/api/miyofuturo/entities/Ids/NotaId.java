package es.uv.api.miyofuturo.entities.Ids;

import java.io.Serializable;

import es.uv.api.miyofuturo.entities.Nota;



public class NotaId implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idusuario;
	private Integer idasignatura;
	
	public NotaId() {
		
	}
	
	public NotaId(int idusu, int idasig) {
		this.idusuario=idusu;
		this.idasignatura = idasig;
	}
	
	public int hashCode() {
		return idusuario + String.valueOf(idasignatura).hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof NotaId))
			return false;
		if (obj == null)
			return false;
		Nota nota = (Nota) obj;
		return nota.getIdusuario().getIdusuario() == idusuario 
				&& nota.getIdasignatura().getIdasignatura() == idasignatura;
	}
	
}
