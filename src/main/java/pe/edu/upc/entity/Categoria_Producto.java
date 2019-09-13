package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Categoria_Producto")
public class Categoria_Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/////////7
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCat_Pro;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria",nullable = false)
	private int idCategoria;
	@ManyToOne
	@JoinColumn(name = "idProducto",nullable = false)
	private int idProducto;
	////////
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public int getIdProductoImpor() {
		return idProducto;
	}
	public void setIdProductoImpor(int idProductoImpor) {
		this.idProducto = idProductoImpor;
	}
	public Categoria_Producto(int idCategoria, int idProductoImpor) {
		super();
		this.idCategoria = idCategoria;
		this.idProducto = idProductoImpor;
	}
	public Categoria_Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
