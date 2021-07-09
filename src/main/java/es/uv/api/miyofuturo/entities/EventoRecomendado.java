package es.uv.api.miyofuturo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uv.api.miyofuturo.entities.Ids.EventoFavoritoId;
import es.uv.api.miyofuturo.entities.Ids.EventoRecomendadoId;

@Entity
@IdClass(EventoRecomendadoId.class)
@Table(name = "evento_recomendado")
public class EventoRecomendado {


	@Id
	@ManyToOne
	@JoinColumn(name ="idevento")
	private Evento idevento;
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idasignatura")
	private Asignatura idasignatura;
	
	public EventoRecomendado() {}

	public EventoRecomendado(Evento idevento, Asignatura idasignatura) {
		super();
		this.idevento = idevento;
		this.idasignatura = idasignatura;
	}

	public Evento getIdevento() {
		return idevento;
	}

	public void setIdevento(Evento idevento) {
		this.idevento = idevento;
	}

	public Asignatura getIdasignatura() {
		return idasignatura;
	}

	public void setIdasignatura(Asignatura idasignatura) {
		this.idasignatura = idasignatura;
	}
	
	
	
}
