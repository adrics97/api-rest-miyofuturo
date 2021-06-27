package es.uv.api.miyofuturo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "academia")
public class Academia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idacademia")
	private int idacademia;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "tipo_clases")
	private String tipo_clases;
	
	@Column(name = "url")
	private String url;

	public Academia () {
		
	}
	
	public Academia(int idacademia, String nombre, String descripcion, String ciudad, String direccion,
			String tipo_clases, String url) {
		super();
		this.idacademia = idacademia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.tipo_clases = tipo_clases;
		this.url = url;
	}

	public int getIdacademia() {
		return idacademia;
	}

	public void setIdacademia(int idacademia) {
		this.idacademia = idacademia;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipo_clases() {
		return tipo_clases;
	}

	public void setTipo_clases(String tipo_clases) {
		this.tipo_clases = tipo_clases;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	

}
