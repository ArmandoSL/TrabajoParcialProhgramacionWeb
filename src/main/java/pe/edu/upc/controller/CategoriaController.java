package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Categoria;
import pe.edu.upc.service.ICategoriaService;
@Named
@RequestScoped
public class CategoriaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ICategoriaService cService;
	private Categoria categoria;
	private String mensaje="";
	List<Categoria>listcategoria;
	@PostConstruct
	public void init()
	{
		this.listcategoria=new ArrayList<Categoria>();
		this.categoria=new Categoria();
		this.lista();
	}
	public String newCategoria()
	{
		this.setCategoria(new Categoria());
		return ".xhtml";
	}
	public void insertar() {
		try {
			cService.insertar(categoria);
			//cleancategoria();
			mensaje="Se registro correctamente";
			//this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void lista() {
		try {
			listcategoria=cService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void CleanCategoria()
	{
		this.init();
	}
	public void eliminar(Categoria cat)
	{
		try {
			cService.eliminar(cat.getIdCategoria());
		} catch (Exception e) {
			e.getMessage();
			mensaje="No se puede eliminar";
		}
	}
	
	
	
	
	//////////////////////////////////7
	public ICategoriaService getcService() {
		return cService;
	}
	public void setcService(ICategoriaService cService) {
		this.cService = cService;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public List<Categoria> getListcategoria() {
		return listcategoria;
	}
	public void setListcategoria(List<Categoria> listcategoria) {
		this.listcategoria = listcategoria;
	}
	public CategoriaController() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoriaController(ICategoriaService cService, Categoria categoria, String mensaje,
			List<Categoria> listcategoria) {
		super();
		this.cService = cService;
		this.categoria = categoria;
		this.mensaje = mensaje;
		this.listcategoria = listcategoria;
	}
	
	
	
	
	
}
