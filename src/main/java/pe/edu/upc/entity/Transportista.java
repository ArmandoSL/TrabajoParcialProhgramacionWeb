package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Transportista")
public class Transportista implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	///////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTransportista;
	
	@Column(name = "Nombre",nullable = false,length = 50)
	private String Nombre;
	@Column(name = "Descripcion",nullable = false,length = 50)
	private String Descripcion;
	@Column(name = "Precio por Kg",nullable = false,length = 50)
	private double PrecioxKg;
	
///////////////
	public int getIdTransportista() {
		return idTransportista;
	}
	public void setIdTransportista(int idTransportista) {
		this.idTransportista = idTransportista;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecioxKg() {
		return PrecioxKg;
	}
	public void setPrecioxKg(double precioxKg) {
		PrecioxKg = precioxKg;
	}
	public Transportista(int idTransportista, String nombre, String descripcion, double precioxKg) {
		super();
		this.idTransportista = idTransportista;
		Nombre = nombre;
		Descripcion = descripcion;
		PrecioxKg = precioxKg;
	}
	public Transportista() {
		super();
		// TODO Auto-generated constructor stub
	}

}
