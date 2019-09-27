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
	private Categoria categoria;
	@ManyToOne
	@JoinColumn(name = "idProductoImportar",nullable = false)
	private ProductoImportar productoimportar;
	////////
	
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria_Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductoImportar getProductoimportar() {
		return productoimportar;
	}
	public void setProductoimportar(ProductoImportar productoimportar) {
		this.productoimportar = productoimportar;
	}
	public Categoria_Producto( Categoria categoria, ProductoImportar productoimportar) {
		super();
	
		this.categoria = categoria;
		this.productoimportar = productoimportar;
	}

	
}
