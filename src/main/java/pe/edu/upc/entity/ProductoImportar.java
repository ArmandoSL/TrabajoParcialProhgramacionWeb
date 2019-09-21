package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ProductoImportar")
public class ProductoImportar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProductoImportar;

	@OneToOne
	@JoinColumn(name = "idMarca", nullable = false)
	private Marca marca;

	@Column(name = "NombreProducto", nullable = false, length = 20)
	private String NombreProducto;
	
	@Column(name = "Descripcion", nullable = false, length = 50)
	private String Descripcion;	
	
	@Column(name = "PrecioCompra", nullable = false, precision = 2)
	private double PrecioCompra;

	

	public ProductoImportar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductoImportar(int idProductoImportar, Marca marca, String nombreProducto, String descripcion,
			double precioCompra) {
		super();
		this.idProductoImportar = idProductoImportar;
		this.marca = marca;
		NombreProducto = nombreProducto;
		Descripcion = descripcion;
		PrecioCompra = precioCompra;
	}

	public int getIdProductoImportar() {
		return idProductoImportar;
	}

	public void setIdProductoImportar(int idProductoImportar) {
		this.idProductoImportar = idProductoImportar;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getNombreProducto() {
		return NombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public double getPrecioCompra() {
		return PrecioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		PrecioCompra = precioCompra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProductoImportar;
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
		ProductoImportar other = (ProductoImportar) obj;
		if (idProductoImportar != other.idProductoImportar)
			return false;
		return true;
	}

}
