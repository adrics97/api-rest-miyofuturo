package es.uv.api.miyofuturo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uv.api.miyofuturo.entities.Ids.PreguntaTestId;
import es.uv.api.miyofuturo.entities.Ids.TestUsuarioId;

@Entity
@IdClass(TestUsuarioId.class)
@Table(name = "test_usuario")
public class TestUsuario {
	
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idtest")
	private Test idtest;
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idusuario")
	private Usuario idusuario;
	

	@Id
	@ManyToOne
	@JoinColumn(name ="idpregunta")
	private Pregunta idpregunta;
	
	private String respuesta;
	
	public TestUsuario() {
		
	}

	public TestUsuario(Test idtest, Usuario idusuario, Pregunta idpregunta, String respuesta) {
		super();
		this.idtest = idtest;
		this.idusuario = idusuario;
		this.idpregunta = idpregunta;
		this.respuesta = respuesta;
	}

	public Test getIdtest() {
		return idtest;
	}

	public void setIdtest(Test idtest) {
		this.idtest = idtest;
	}

	public Usuario getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario) {
		this.idusuario = idusuario;
	}

	public Pregunta getIdpregunta() {
		return idpregunta;
	}

	public void setIdpregunta(Pregunta idpregunta) {
		this.idpregunta = idpregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	
}
