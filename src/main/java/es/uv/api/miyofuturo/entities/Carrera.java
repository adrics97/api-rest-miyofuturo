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
@Table(name = "carrera")
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcarrera")
	private int idcarrera;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "area")
	private String area;
	
	@OneToMany(mappedBy = "idcarrera")
	private List<CarreraUniversidad> carreras_universidades = new ArrayList<CarreraUniversidad>();
	
	public Carrera(){
		
	}

	public Carrera(int idcarrera, String nombre, String descripcion, String area) {
		super();
		this.idcarrera = idcarrera;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.area = area;
	}

	
	public int getIdcarrera() {
		return idcarrera;
	}

	public void setIdcarrera(int idcarrera) {
		this.idcarrera = idcarrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	
}
