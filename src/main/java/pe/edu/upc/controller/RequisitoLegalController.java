package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Requisito_legal;
import pe.edu.upc.service.IRequisitoLegalService;

@Named
@RequestScoped
public class RequisitoLegalController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IRequisitoLegalService rService;
	private Requisito_legal requisito_legal;
	private String mensaje = "";
	List<Requisito_legal> listaRequisito_legal;

	@PostConstruct
	public void init() {
		this.listaRequisito_legal = new ArrayList<Requisito_legal>();
		this.requisito_legal = new Requisito_legal();
		this.lista();
	}

	public String newRequisito_legal() {
		this.setRequisito_legal(new Requisito_legal());
		return ".xhtml";
	}

	public void insertar() {
		try {
			rService.insertar(requisito_legal);
			// cleanespecialidad();
			mensaje = "Se registro correctamente";
			// this.lista();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void lista() {
		try {
			listaRequisito_legal = rService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void CleanRequisito_legal() {
		this.init();
	}

	public void Eliminar(Requisito_legal requis) {
		try {
			rService.eliminar(requis.getIdRequisitos());
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede eliminar";
		}
	}
//////////////////////////////////////////

	public IRequisitoLegalService getrService() {
		return rService;
	}

	public void setrService(IRequisitoLegalService rService) {
		this.rService = rService;
	}

	public Requisito_legal getRequisito_legal() {
		return requisito_legal;
	}

	public void setRequisito_legal(Requisito_legal requisito_legal) {
		this.requisito_legal = requisito_legal;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Requisito_legal> getListaRequisito_legal() {
		return listaRequisito_legal;
	}

	public void setListaRequisito_legal(List<Requisito_legal> listaRequisito_legal) {
		this.listaRequisito_legal = listaRequisito_legal;
	}

	public RequisitoLegalController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequisitoLegalController(IRequisitoLegalService rService, Requisito_legal requisito_legal, String mensaje,
			List<Requisito_legal> listaRequisito_legal) {
		super();
		this.rService = rService;
		this.requisito_legal = requisito_legal;
		this.mensaje = mensaje;
		this.listaRequisito_legal = listaRequisito_legal;
	}
	
	
	
}
