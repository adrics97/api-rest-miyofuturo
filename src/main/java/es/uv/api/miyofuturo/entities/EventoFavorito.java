package es.uv.api.miyofuturo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uv.api.miyofuturo.entities.Ids.EventoFavoritoId;

@Entity
@IdClass(EventoFavoritoId.class)
@Table(name = "evento_favorito")
public class EventoFavorito {

	@Id
	@ManyToOne
	@JoinColumn(name ="idevento")
	private Evento idevento;
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idusuario")
	private Usuario idusuario;
	
	
	
	@Column(name = "valoracion")
	private int valoracion;
	
	@Column(name = "comentario")
	private String comentario;
	
	
	public EventoFavorito(){
		
	}
	
	public EventoFavorito(Evento idevento, Usuario idusuario, int valoracion, String comentario) {
		this.idevento = idevento;
		this.idusuario = idusuario;
		this.valoracion = valoracion;
		this.comentario = comentario;
	}

	public Evento getIdevento() {
		return idevento;
	}

	public void setIdevento(Evento idevento) {
		this.idevento = idevento;
	}

	public Usuario getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario) {
		this.idusuario = idusuario;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
