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
@Table(name = "asignatura")
public class Asignatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idasignatura")
	private int idasignatura;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "idasignatura")
	private List<Nota> notas = new ArrayList<Nota>();
	
	public Asignatura() {
		
	}
	
	public Asignatura(int id, String nombre) {
		this.idasignatura = id;
		this.nombre = nombre;
	}

	public int getIdasignatura() {
		return idasignatura;
	}

	public void setIdasignatura(int idasignatura) {
		this.idasignatura = idasignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
