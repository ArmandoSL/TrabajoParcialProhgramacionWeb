package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductoEmpresa")
public class ProductoEmpresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProductoEmpresa;
	@Column(name = "Nombre", nullable = false,length = 20)
	private String Nombre;
	@Column(name = "Descripcion", nullable = false,length = 50)
	private String Descripcion;
	@Column(name = "Preciocompra", nullable = false,precision = 2)
	private double Preciocompra;
	@Column(name = "Precioventa", nullable = false,precision = 2)
	private double Precioventa;
	@Column(name = "Stock", nullable = false)
	private int Stock;

	public int getIdProductoEmpresa() {
		return idProductoEmpresa;
	}

	public void setIdProductoEmpresa(int idProductoEmpresa) {
		this.idProductoEmpresa = idProductoEmpresa;
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

	public double getPreciocompra() {
		return Preciocompra;
	}

	public void setPreciocompra(double preciocompra) {
		Preciocompra = preciocompra;
	}

	public double getPrecioventa() {
		return Precioventa;
	}

	public void setPrecioventa(double precioventa) {
		Precioventa = precioventa;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public ProductoEmpresa(int idProductoEmpresa, String nombre, String descripcion, double preciocompra,
			double precioventa, int stock) {
		super();
		this.idProductoEmpresa = idProductoEmpresa;
		Nombre = nombre;
		Descripcion = descripcion;
		Preciocompra = preciocompra;
		Precioventa = precioventa;
		Stock = stock;
	}

	public ProductoEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProductoEmpresa;
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
		ProductoEmpresa other = (ProductoEmpresa) obj;
		if (idProductoEmpresa != other.idProductoEmpresa)
			return false;
		return true;
	}

}
