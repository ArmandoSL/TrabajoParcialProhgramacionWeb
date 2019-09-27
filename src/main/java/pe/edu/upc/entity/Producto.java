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
@Table(name = "ProductoEmpresa")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	@ManyToOne
	@JoinColumn(name = "idMarca", nullable = false)
	private Marca marca;
	@ManyToOne
	@JoinColumn(name = "idCategoria", nullable = false)
	private Categoria categoria;

	@Column(name = "Nombre", nullable = false, length = 20)
	private String Nombre;
	@Column(name = "Descripcion", nullable = false, length = 50)
	private String Descripcion;
	@Column(name = "Preciocompra", nullable = false, precision = 2)
	private double Preciocompra;




	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProducto;
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
		Producto other = (Producto) obj;
		if (idProducto != other.idProducto)
			return false;
		return true;
	}

}
