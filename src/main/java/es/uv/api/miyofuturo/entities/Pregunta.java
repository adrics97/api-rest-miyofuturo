package es.uv.api.miyofuturo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpregunta")
	private int idpregunta;
	
	@Column(name = "pregunta")
	private String pregunta;
	

	@OneToMany(mappedBy = "idpregunta")
	private List<PreguntaTest> preguntas_test = new ArrayList<PreguntaTest>();
	
	public Pregunta() {
		
	}

	public Pregunta(int idpregunta, String pregunta) {
		super();
		this.idpregunta = idpregunta;
		this.pregunta = pregunta;
	}

	public int getIdpregunta() {
		return idpregunta;
	}

	public void setIdpregunta(int idpregunta) {
		this.idpregunta = idpregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	
	
	
}
