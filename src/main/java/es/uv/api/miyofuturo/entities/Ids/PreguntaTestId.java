package es.uv.api.miyofuturo.entities.Ids;

import java.io.Serializable;

import es.uv.api.miyofuturo.entities.EventoFavorito;
import es.uv.api.miyofuturo.entities.PreguntaTest;

public class PreguntaTestId implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idtest;
	private Integer idpregunta;

	
	public PreguntaTestId() {
		
	}
	
	public PreguntaTestId(int idtest, int idpre) {
		this.idtest = idtest;
		this.idpregunta=idpre;
		
	}
	
	public int hashCode() {
		return idtest + String.valueOf(idpregunta).hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof PreguntaTestId))
			return false;
		if (obj == null)
			return false;
		PreguntaTest pregunta_test = (PreguntaTest) obj;
		return pregunta_test.getIdtest().getIdtest() == idtest 
				&& pregunta_test.getIdpregunta().getIdpregunta() == idpregunta;
	}
	
}
