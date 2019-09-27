package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Especialidad;
import pe.edu.upc.service.IEspecialidadService;


@Named
@RequestScoped
public class EspecialidadController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IEspecialidadService eService;
	private Especialidad especialidad;
	private String mensaje="";
	List<Especialidad>listespecialidad;
	@PostConstruct
	public void init()
	{
		this.listespecialidad=new ArrayList<Especialidad>();
		this.especialidad=new Especialidad();
		this.lista();
	}
	public String newEspecialidad()
	{
		this.setEspecialidad(new Especialidad());
		return ".xhtml";
	}
	public void insertar() {
		try {
			eService.insertar(especialidad);
			//cleanespecialidad();
			mensaje="Se registro correctamente";
			//this.lista();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void lista() {
		try {
			listespecialidad=eService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void CleanEspecialidad()
	{
		this.init();
	}
	public void eliminar(Especialidad esp)
	{
		try {
			eService.eliminar(esp.getIdEspecialidad());
		} catch (Exception e) {
			e.getMessage();
			mensaje="No se puede eliminar";
		}
	}
	
	////////////////////////
	public IEspecialidadService geteService() {
		return eService;
	}
	public void seteService(IEspecialidadService eService) {
		this.eService = eService;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public List<Especialidad> getListespecialidad() {
		return listespecialidad;
	}
	public void setListespecialidad(List<Especialidad> listespecialidad) {
		this.listespecialidad = listespecialidad;
	}
	public EspecialidadController() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EspecialidadController(IEspecialidadService eService, Especialidad especialidad, String mensaje,
			List<Especialidad> listespecialidad) {
		super();
		this.eService = eService;
		this.especialidad = especialidad;
		this.mensaje = mensaje;
		this.listespecialidad = listespecialidad;
	}
	

}
