package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Abogado")
public class Abogado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAbogado;
	@ManyToOne
	@JoinColumn(name = "idEspecialidad",nullable = false)
	private Especialidad especialidad;
		
	@Column(name = "NombreAbogado",nullable = false,length = 50)
	private String NombreAbogado;
	@Column(name = "Precio",nullable = false,length = 50)
	private double Precio;
	@Column(name = "FechaEstimada",nullable = false,length = 50)
	private Date FechaEstimada;
	///////

	public int getIdAbogado() {
		return idAbogado;
	}

	public void setIdAbogado(int idAbogado) {
		this.idAbogado = idAbogado;
	}

	

	public String getNombreAbogado() {
		return NombreAbogado;
	}

	public void setNombreAbogado(String nombreAbogado) {
		NombreAbogado = nombreAbogado;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public Date getFechaEstimada() {
		return FechaEstimada;
	}

	public void setFechaEstimada(Date fechaEstimada) {
		FechaEstimada = fechaEstimada;
	}

	public Abogado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Abogado(int idAbogado, Especialidad especialidad, String nombreAbogado, double precio, Date fechaEstimada) {
		super();
		this.idAbogado = idAbogado;
		this.especialidad = especialidad;
		NombreAbogado = nombreAbogado;
		Precio = precio;
		FechaEstimada = fechaEstimada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAbogado;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Abogado other = (Abogado) obj;
		if (idAbogado != other.idAbogado)
			return false;
		return true;
	}


	
	
	
}
