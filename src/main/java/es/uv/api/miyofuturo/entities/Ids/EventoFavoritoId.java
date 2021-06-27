package es.uv.api.miyofuturo.entities.Ids;

import java.io.Serializable;

import es.uv.api.miyofuturo.entities.EventoFavorito;

public class EventoFavoritoId  implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idevento;
	private Integer idusuario;
	
	
	public EventoFavoritoId() {
		
	}
	
	public EventoFavoritoId(int ideve, int idusu) {
		this.idevento = ideve;
		this.idusuario=idusu;
		
	}
	
	public int hashCode() {
		return idevento + String.valueOf(idusuario).hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof EventoFavoritoId))
			return false;
		if (obj == null)
			return false;
		EventoFavorito eveF = (EventoFavorito) obj;
		return eveF.getIdevento().getIdevento() == idevento 
				&& eveF.getIdusuario().getIdusuario() == idusuario;
	}
	
}
