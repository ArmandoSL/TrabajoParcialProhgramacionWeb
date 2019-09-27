package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.ProductoEmpresa;
import pe.edu.upc.service.IProductoEmpresaService;

@Named
@RequestScoped
public class ProductoEmpresaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IProductoEmpresaService pService;
	private ProductoEmpresa productoempresa;
	private String mensaje = "";
	List<ProductoEmpresa> listaproductoemp;

	@PostConstruct
	public void init() {
		this.listaproductoemp = new ArrayList<ProductoEmpresa>();
		this.productoempresa = new ProductoEmpresa();
		this.lista();
	}

	public String newProductoEmpresa() {
		this.setProductoempresa(new ProductoEmpresa());
		return ".xhtml";
	}

	public void insertar() {
		try {
			pService.insertar(productoempresa);
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

	public void Eliminar(ProductoEmpresa produc) {
		try {
			pService.eliminar(produc.getIdProductoEmpresa());
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede eliminar";
		}
	}

	public IProductoEmpresaService getpService() {
		return pService;
	}

	public void setpService(IProductoEmpresaService pService) {
		this.pService = pService;
	}

	public ProductoEmpresa getProductoempresa() {
		return productoempresa;
	}

	public void setProductoempresa(ProductoEmpresa productoempresa) {
		this.productoempresa = productoempresa;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<ProductoEmpresa> getListaproductoemp() {
		return listaproductoemp;
	}

	public void setListaproductoemp(List<ProductoEmpresa> listaproductoemp) {
		this.listaproductoemp = listaproductoemp;
	}

	public ProductoEmpresaController(IProductoEmpresaService pService, ProductoEmpresa productoempresa, String mensaje,
			List<ProductoEmpresa> listaproductoemp) {
		super();
		this.pService = pService;
		this.productoempresa = productoempresa;
		this.mensaje = mensaje;
		this.listaproductoemp = listaproductoemp;
	}

	public ProductoEmpresaController() {
		super();
		// TODO Auto-generated constructor stub
	}

}
