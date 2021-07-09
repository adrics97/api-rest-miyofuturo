package es.uv.api.miyofuturo.entities;

import java.sql.Date;
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
@Table(name = "evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idevento")
	private int idevento;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "image")
	private String image;
	
	@OneToMany(mappedBy = "idevento")
	List<EventoFavorito> eventos_favoritos = new ArrayList<EventoFavorito>();
	
	public Evento() {
		
	}
	
	public Evento(int id, String nom, String des, String ciu, Date f, String url) {
		this.idevento=id;
		this.nombre=nom;
		this.descripcion=des;
		this.ciudad=ciu;
		this.fecha=f;
		this.url=url;
	}

	public int getIdevento() {
		return idevento;
	}

	public void setIdevento(int idevento) {
		this.idevento = idevento;
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String ima) {
		this.image = ima;
	}
	
	
	
}
