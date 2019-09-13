package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Detalle")
public class Detalle implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	///////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalle;
	@ManyToOne
	@JoinColumn(name ="idProducto",nullable = false)
	private int idProducto;
	@Column(name = "Cantidad",nullable = false,length = 50)
	private int Cantidad;
	@Column(name = "Importe",nullable = false,length = 50)
	private int Importe;
	@Column(name = "Descuento",nullable = false,length = 50)
	private double Descuento;
	@Column(name = "Peso",nullable = false,length = 50)
	private double Peso;
	
	/////////////////
	public int getIdFactura() {
		return idDetalle;
	}
	public void setIdFactura(int idFactura) {
		this.idDetalle = idFactura;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public int getImporte() {
		return Importe;
	}
	public void setImporte(int importe) {
		Importe = importe;
	}
	public double getDescuento() {
		return Descuento;
	}
	public void setDescuento(double descuento) {
		Descuento = descuento;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public Detalle(int idFactura, int idProducto, int cantidad, int importe, double descuento, double peso) {
		super();
		this.idDetalle = idFactura;
		this.idProducto = idProducto;
		Cantidad = cantidad;
		Importe = importe;
		Descuento = descuento;
		Peso = peso;
	}
	public Detalle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
