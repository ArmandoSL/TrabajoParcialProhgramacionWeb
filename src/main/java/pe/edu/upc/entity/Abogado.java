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
	private int idEspecialidad;
		
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

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
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

	public Abogado(int idAbogado, int idEspecialidad, String nombreAbogado, double precio, Date fechaEstimada) {
		super();
		this.idAbogado = idAbogado;
		this.idEspecialidad = idEspecialidad;
		NombreAbogado = nombreAbogado;
		Precio = precio;
		FechaEstimada = fechaEstimada;
	}
	
	
	
}
