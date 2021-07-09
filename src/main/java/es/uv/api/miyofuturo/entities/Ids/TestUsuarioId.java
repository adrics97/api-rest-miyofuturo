package es.uv.api.miyofuturo.entities.Ids;

import java.io.Serializable;

import es.uv.api.miyofuturo.entities.PreguntaTest;
import es.uv.api.miyofuturo.entities.TestUsuario;

public class TestUsuarioId  implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idtest;
	private Integer idusuario;
	private Integer idpregunta;

	public TestUsuarioId() {
		
	}
	
	public TestUsuarioId(int idtest, int usu, int idpre) {
		this.idtest = idtest;
		this.idusuario = usu;
		this.idpregunta=idpre;
		
	}
	
	public int hashCode() {
		return idtest + idusuario + String.valueOf(idpregunta).hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof TestUsuarioId))
			return false;
		if (obj == null)
			return false;
		TestUsuario test_usuario = (TestUsuario) obj;
		return test_usuario.getIdtest().getIdtest() == idtest 
				&& test_usuario.getIdpregunta().getIdpregunta() == idpregunta
				&& test_usuario.getIdusuario().getIdusuario() == idusuario;
	}

}