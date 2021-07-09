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
@Table(name = "test")
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtest")
	private int idtest;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "idtest")
	private List<PreguntaTest> preguntas_test = new ArrayList<PreguntaTest>();

	private Test() {
		
	}

	public Test(int idtest, String nombre) {
		super();
		this.idtest = idtest;
		this.nombre = nombre;
	}

	public int getIdtest() {
		return idtest;
	}

	public void setIdtest(int idtest) {
		this.idtest = idtest;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
