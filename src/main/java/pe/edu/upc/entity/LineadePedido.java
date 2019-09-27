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
@Table(name = "LineadePedido")
public class LineadePedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLineadepedido;
	
	@ManyToOne
	@JoinColumn(name = "idProductoEmpresa",nullable = false)
	private ProductoEmpresa productoempresa;
	
	@ManyToOne
	@JoinColumn(name = "idDeclaracion",nullable = false)
	private Declaracion_aduanera declaracion;
	
	@Column(name = "boolinfo")
	private boolean boolinfo;
	@Column(name = "descripcion",nullable = false,length = 50)
	private String descripcion;
	
	public int getIdLineadepedido() {
		return idLineadepedido;
	}
	public void setIdLineadepedido(int idLineadepedido) {
		this.idLineadepedido = idLineadepedido;
	}
	public ProductoEmpresa getProductoempresa() {
		return productoempresa;
	}
	public void setProductoempresa(ProductoEmpresa productoempresa) {
		this.productoempresa = productoempresa;
	}
	public Declaracion_aduanera getDeclaracion() {
		return declaracion;
	}
	public void setDeclaracion(Declaracion_aduanera declaracion) {
		this.declaracion = declaracion;
	}
	public boolean isBoolinfo() {
		return boolinfo;
	}
	public void setBoolinfo(boolean boolinfo) {
		this.boolinfo = boolinfo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LineadePedido(int idLineadepedido, ProductoEmpresa productoempresa, Declaracion_aduanera declaracion,
			boolean boolinfo, String descripcion) {
		super();
		this.idLineadepedido = idLineadepedido;
		this.productoempresa = productoempresa;
		this.declaracion = declaracion;
		this.boolinfo = boolinfo;
		this.descripcion = descripcion;
	}
	public LineadePedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
