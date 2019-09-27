package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Flete;
import pe.edu.upc.service.IFleteService;

@Named
@RequestScoped
public class FleteController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IFleteService fService;
	private Flete flete;
	private String mensaje = "";
	List<Flete> listaflete;

	@PostConstruct
	public void init() {
		this.listaflete = new ArrayList<Flete>();
		this.flete = new Flete();
		this.lista();
	}

	public String newFlete() {
		this.setFlete(new Flete());
		return ".xhtml";
	}

	public void insertar() {
		try {
			fService.insertar(flete);
			mensaje = "Se registró correctamente";
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void lista() {
		try {
			listaflete = fService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void CleanFlete() {
		this.init();
	}

	public void eliminar(Flete flete) {
		try {
			fService.eliminar(flete.getIdFlete());
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede eliminar";
		}
	}

	public IFleteService getfService() {
		return fService;
	}

	public void setfService(IFleteService fService) {
		this.fService = fService;
	}

	public Flete getFlete() {
		return flete;
	}

	public void setFlete(Flete flete) {
		this.flete = flete;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Flete> getListaflete() {
		return listaflete;
	}

	public void setListaflete(List<Flete> listaflete) {
		this.listaflete = listaflete;
	}

	public FleteController(IFleteService fService, Flete flete, String mensaje, List<Flete> listaflete) {
		super();
		this.fService = fService;
		this.flete = flete;
		this.mensaje = mensaje;
		this.listaflete = listaflete;
	}

	public FleteController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
