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
@Table(name = "universidad")
public class Universidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iduniversidad")
	private int iduniversidad;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "abreviatura")
	private String abreviatura;

	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "comunidad")
	private String comunidad;
	
	@Column(name = "provincia")
	private String provincia;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "url")
	private String url;
	
	@OneToMany(mappedBy = "iduniversidad")
	private List<CarreraUniversidad> carreras_universidades = new ArrayList<CarreraUniversidad>();
	
	public Universidad() {
		
	}

	public Universidad(int iduniversidad, String nombre, String abreviatura, String descripcion, String comunidad,
			String provincia, String tipo, String url) {
		super();
		this.iduniversidad = iduniversidad;
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.descripcion = descripcion;
		this.comunidad = comunidad;
		this.provincia = provincia;
		this.tipo = tipo;
		this.url = url;
	}

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
