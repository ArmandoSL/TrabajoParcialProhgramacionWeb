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
	@Column(name = "PrecioporKg",nullable = false,precision = 2)
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTransportista;
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
		Transportista other = (Transportista) obj;
		if (idTransportista != other.idTransportista)
			return false;
		return true;
	}
	

}
