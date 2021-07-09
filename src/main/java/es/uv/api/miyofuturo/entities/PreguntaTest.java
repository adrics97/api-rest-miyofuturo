package es.uv.api.miyofuturo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import es.uv.api.miyofuturo.entities.Ids.PreguntaTestId;

@Entity
@IdClass(PreguntaTestId.class)
@Table(name = "pregunta_test")
public class PreguntaTest {

	@Id
	@ManyToOne
	@JoinColumn(name ="idtest")
	private Test idtest;
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idpregunta")
	private Pregunta idpregunta;
	
	public PreguntaTest() {
		
	}

	public PreguntaTest(Test idtest, Pregunta idpregunta) {
		super();
		this.idtest = idtest;
		this.idpregunta = idpregunta;
	}

	public Test getIdtest() {
		return idtest;
	}

	public void setIdtest(Test idtest) {
		this.idtest = idtest;
	}

	public Pregunta getIdpregunta() {
		return idpregunta;
	}

	public void setIdpregunta(Pregunta idpregunta) {
		this.idpregunta = idpregunta;
	}
	
	
	
	
}
