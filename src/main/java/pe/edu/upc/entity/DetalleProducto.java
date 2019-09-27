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
@Table(name = "DetalleProducto")
public class DetalleProducto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	///////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalle;

	@ManyToOne
	@JoinColumn(name = "idProductoImportar", nullable = false)
	private ProductoImportar productoImportar;

	@ManyToOne
	@JoinColumn(name = "idFlete", nullable = false)
	private Flete flete;

	@Column(name = "Cantidad", nullable = false, length = 50)
	private int Cantidad;
	@Column(name = "Importe", nullable = false, length = 50)
	private int Importe;
	@Column(name = "Descuento", nullable = false, precision = 2)
	private double Descuento;
	@Column(name = "Peso", nullable = false, precision = 2)
	private double Peso;

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public ProductoImportar getProductoImportar() {
		return productoImportar;
	}

	public void setProductoImportar(ProductoImportar productoImportar) {
		this.productoImportar = productoImportar;
	}

	public Flete getFlete() {
		return flete;
	}

	public void setFlete(Flete flete) {
		this.flete = flete;
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

	public DetalleProducto(int idDetalle, ProductoImportar productoImportar, Flete flete, int cantidad, int importe,
			double descuento, double peso) {
		super();
		this.idDetalle = idDetalle;
		this.productoImportar = productoImportar;
		this.flete = flete;
		Cantidad = cantidad;
		Importe = importe;
		Descuento = descuento;
		Peso = peso;
	}

	public DetalleProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDetalle;
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
		DetalleProducto other = (DetalleProducto) obj;
		if (idDetalle != other.idDetalle)
			return false;
		return true;
	}

	/////////////////

}
