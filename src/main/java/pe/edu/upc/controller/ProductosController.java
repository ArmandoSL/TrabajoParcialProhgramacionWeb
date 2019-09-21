package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entity.ProductoImportar;
import pe.edu.upc.service.IProductosService;

public class ProductosController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IProductosService mS;
	private ProductoImportar productos;
	List<ProductoImportar> listaProductoss;

	@PostConstruct
	public void init() {
		this.listaProductoss = new ArrayList<ProductoImportar>();
		this.productos = new ProductoImportar();
		this.listar();
	}

	public String nuevoProducto() {
		this.setProductos(new ProductoImportar());
		return "producto.xhtml";
	}

	public void insertar() {
		try {
			mS.insertar(productos);
			limpiarProductos();
			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listar() {
		try {
			listaProductoss = mS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarProductos() {
		this.init();
	}

	public void eliminar(ProductoImportar pro) {
		try {
			mS.eliminar(pro.getIdProductoImportar());
			listar();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public ProductoImportar getProductos() {
		return productos;
	}

	public void setProductos(ProductoImportar productos) {
		this.productos = productos;
	}

	public List<ProductoImportar> getListaProductoss() {
		return listaProductoss;
	}

	public void setListaProductoss(List<ProductoImportar> listaProductoss) {
		this.listaProductoss = listaProductoss;
	}

}
