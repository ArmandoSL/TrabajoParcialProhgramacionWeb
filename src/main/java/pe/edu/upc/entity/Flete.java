package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Flete")
public class Flete implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	///////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFlete;
	@ManyToOne
	@JoinColumn(name = "idTransportista",nullable = false)
	private int idTransportista;
	@OneToOne
	@JoinColumn(name = "idDetalle",nullable = false)
	private int idDetalle;
	@Column(name = "MontoTotal",nullable = false,length = 50)
	private double MontoTotal;
	@Column(name = "Descripcion",nullable = false,length = 50)
	private String Descripcion;
	@Column(name = "PesoTotal",nullable = false,length = 50)
	private double PesoTotal;
	@Column(name = "Precio Flete",nullable = false,length = 50)
	private double precioFlete;
	
	/////////////////////
	public int getIdFlete() {
		return idFlete;
	}
	public void setIdFlete(int idFlete) {
		this.idFlete = idFlete;
	}
	public int getIdTransportista() {
		return idTransportista;
	}
	public void setIdTransportista(int idTransportista) {
		this.idTransportista = idTransportista;
	}
	public int getIdDetalle() {
		return idDetalle;
	}
	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}
	public double getMontoTotal() {
		return MontoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		MontoTotal = montoTotal;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPesoTotal() {
		return PesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		PesoTotal = pesoTotal;
	}
	public double getFlete() {
		return precioFlete;
	}
	public void setprecioFlete(double flete) {
		precioFlete = flete;
	}
	public Flete(int idFlete, int idTransportista, int idDetalle, double montoTotal, String descripcion,
			double pesoTotal, double flete) {
		super();
		this.idFlete = idFlete;
		this.idTransportista = idTransportista;
		this.idDetalle = idDetalle;
		MontoTotal = montoTotal;
		Descripcion = descripcion;
		PesoTotal = pesoTotal;
		precioFlete = flete;
	}
	public Flete() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
