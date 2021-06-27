package es.uv.api.miyofuturo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uv.api.miyofuturo.entities.Ids.CarreraUniversidadId;

@Entity
@IdClass(CarreraUniversidadId.class)
@Table(name = "carrera_universidad")
public class CarreraUniversidad {

	
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idcarrera")
	private Carrera idcarrera;
	
	@Id
	@ManyToOne
	@JoinColumn(name ="iduniversidad")
	private Universidad iduniversidad;
	
	@Column(name = "nota_corte")
	private double nota_corte;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "url")
	private String url;

	public CarreraUniversidad(){
		
	}
	
	public CarreraUniversidad(Carrera idcarrera, Universidad iduniversidad, double nota_corte, double precio,
			String url) {
		this.idcarrera = idcarrera;
		this.iduniversidad = iduniversidad;
		this.nota_corte = nota_corte;
		this.precio = precio;
		this.url = url;
	}

	public Carrera getIdcarrera() {
		return idcarrera;
	}

	public void setIdcarrera(Carrera idcarrera) {
		this.idcarrera = idcarrera;
	}

	public Universidad getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(Universidad iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public double getNota_corte() {
		return nota_corte;
	}

	public void setNota_corte(double nota_corte) {
		this.nota_corte = nota_corte;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
