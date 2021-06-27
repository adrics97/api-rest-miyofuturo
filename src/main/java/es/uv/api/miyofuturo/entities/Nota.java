package es.uv.api.miyofuturo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uv.api.miyofuturo.entities.Ids.NotaId;

@Entity
@IdClass(NotaId.class)
@Table(name = "nota")
public class Nota {
	
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idusuario")
	private Usuario idusuario;
	
	@Id
	@ManyToOne
	@JoinColumn(name ="idasignatura")
	private Asignatura idasignatura;
	
	
	
	@Column(name = "calificacion_1")
	private double calificacion_1;
	
	@Column(name = "calificacion_2")
	private double calificacion_2;
	
	@Column(name = "calificacion_3")
	private double calificacion_3;
	
	public Nota() {
		
	}
	
	public Nota(Asignatura idasig, Usuario idusu, double cal1, double cal2, double cal3) {
		this.idasignatura = idasig;
		this.idusuario = idusu;
		this.calificacion_1 = cal1;
		this.calificacion_2 = cal2;
		this.calificacion_3 = cal3;
	}


	public Asignatura getIdasignatura() {
		return idasignatura;
	}

	public void setIdasignatura(Asignatura idasignatura) {
		this.idasignatura = idasignatura;
	}

	public Usuario getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario) {
		this.idusuario = idusuario;
	}

	public double getCalificacion_1() {
		return calificacion_1;
	}

	public void setCalificacion_1(double calificacion_1) {
		this.calificacion_1 = calificacion_1;
	}

	public double getCalificacion_2() {
		return calificacion_2;
	}

	public void setCalificacion_2(double calificacion_2) {
		this.calificacion_2 = calificacion_2;
	}

	public double getCalificacion_3() {
		return calificacion_3;
	}

	public void setCalificacion_3(double calificacion_3) {
		this.calificacion_3 = calificacion_3;
	}

	public void print() {
		System.out.println(
				this.idusuario.getIdusuario()+" , "+
				this.idasignatura.getIdasignatura()+" , "+
				this.calificacion_1+" , "+
				this.calificacion_2+" , "+
				this.calificacion_3+" , "
				);
		}
	

}
