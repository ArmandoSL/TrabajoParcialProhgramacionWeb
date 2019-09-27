package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Producto;
import pe.edu.upc.service.IProductoService;

@Named
@RequestScoped
public class ProductoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IProductoService pService;
	private Producto producto;
	private String mensaje = "";
	List<Producto> listaproductoemp;

	@PostConstruct
	public void init() {
		this.listaproductoemp = new ArrayList<Producto>();
		this.producto = new Producto();
		this.lista();
	}

	public String newProductoEmpresa() {
		this.setProducto(new Producto());
		return ".xhtml";
	}

	public void insertar() {
		try {
			pService.insertar(producto);
			// cleanespecialidad();
			mensaje = "Se registro correctamente";
			// this.lista();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void lista() {
		try {
			listaproductoemp = pService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void CleanProductoempresa() {
		this.init();
	}

	public void Eliminar(Producto produc) {
		try {
			pService.eliminar(produc.getIdProducto());
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede eliminar";
		}
	}

	public IProductoService getpService() {
		return pService;
	}

	public void setpService(IProductoService pService) {
		this.pService = pService;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Producto> getListaproductoemp() {
		return listaproductoemp;
	}

	public void setListaproductoemp(List<Producto> listaproductoemp) {
		this.listaproductoemp = listaproductoemp;
	}

	

	public ProductoController(IProductoService pService, Producto producto, String mensaje,
			List<Producto> listaproductoemp) {
		super();
		this.pService = pService;
		this.producto = producto;
		this.mensaje = mensaje;
		this.listaproductoemp = listaproductoemp;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public ProductoController() {
		super();
		// TODO Auto-generated constructor stub
	}

}
