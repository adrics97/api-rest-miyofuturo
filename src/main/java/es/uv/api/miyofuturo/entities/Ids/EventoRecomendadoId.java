package es.uv.api.miyofuturo.entities.Ids;

import java.io.Serializable;

import es.uv.api.miyofuturo.entities.EventoFavorito;
import es.uv.api.miyofuturo.entities.EventoRecomendado;

public class EventoRecomendadoId implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idevento;
	private Integer idasignatura;
	
	EventoRecomendadoId(){}

	public EventoRecomendadoId(Integer idevento, Integer idasignatura) {
		super();
		this.idevento = idevento;
		this.idasignatura = idasignatura;
	}
	

	public int hashCode() {
		return idevento + String.valueOf(idasignatura).hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof EventoRecomendadoId))
			return false;
		if (obj == null)
			return false;
		EventoRecomendado eveRec = (EventoRecomendado) obj;
		return eveRec.getIdevento().getIdevento() == idevento 
				&& eveRec.getIdasignatura().getIdasignatura()== idasignatura;
	}
	
}
