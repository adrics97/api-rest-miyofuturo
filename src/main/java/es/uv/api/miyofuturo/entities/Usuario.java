package es.uv.api.miyofuturo.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario")
	private int idusuario;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefono")
	private int telefono;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "curso")
	private String curso;
	
	@Column(name = "instituto")
	private String instituto;
	
	@OneToMany(mappedBy = "idusuario")
	private List<Nota> notas = new ArrayList<Nota>();
	
	@OneToMany(mappedBy = "idusuario")
	private List<EventoFavorito> eventos_favoritos = new ArrayList<EventoFavorito>();
	


	public Usuario() {
		
	}

	public Usuario(String nombre, String ape, String email, int tel, String ciu, String dir, String curs, String inst ) {
		increment();
		this.idusuario = getIdusuario();
		this.apellidos =ape;
		this.email =email;
		this.telefono = tel;
		this.ciudad = ciu;
		this.direccion = dir;
		this.curso = curs;
		this.instituto =inst;
		
		
	}
	
	 public void increment() {
		 System.out.println("AQUI NO ENTRO");
		 setIdusuario(getIdusuario() + 1);
	 }
	public int getIdusuario() {
		return idusuario;
	}
	
	public void setIdusuario(int id) {
		this.idusuario = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getInstituto() {
		return instituto;
	}

	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}



}
