package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Abogado;
import pe.edu.upc.entity.Especialidad;
import pe.edu.upc.service.IAbogadoService;
import pe.edu.upc.service.IEspecialidadService;

@Named
@RequestScoped
public class AbogadoController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IAbogadoService pkS;
	@Inject
	private IEspecialidadService fkS;
	private Abogado abogado;
	private Especialidad especialidad;
	private List<Abogado>listAbogado;
	private List<Especialidad>listEspecialidad;
	//////////////////////////////////////////
	@PostConstruct
	public void init() 
	{
		abogado=new Abogado();
		especialidad=new Especialidad();
		listAbogado=new ArrayList<>();
		listEspecialidad=new ArrayList<>();
		listarAbogado();
		listarEspecialidad();
	}
	public String newAbogado()
	{
		this.setAbogado(new Abogado());
		return ".xhtml";
	}
	public void insertar()
	{
		try {
			pkS.insertar(abogado);
			cleanAbogado();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void eliminar(Abogado abogado)
	{
		try {
			pkS.eliminar(abogado.getIdAbogado());
			listarAbogado();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void  listarAbogado() 
	{
		try {
			listAbogado=pkS.listar();
		} catch (Exception e) {
		e.getMessage();
		}
	}
	public void listarEspecialidad()
	{
		try {
			listEspecialidad=fkS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void cleanAbogado() {
	this.init();
	}
	
	
	//////////////////////////////////////////
	public IAbogadoService getPkS() {
		return pkS;
	}
	public void setPkS(IAbogadoService pkS) {
		this.pkS = pkS;
	}
	public IEspecialidadService getFkS() {
		return fkS;
	}
	public void setFkS(IEspecialidadService fkS) {
		this.fkS = fkS;
	}
	public Abogado getAbogado() {
		return abogado;
	}
	public void setAbogado(Abogado abogado) {
		this.abogado = abogado;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public List<Abogado> getListAbogado() {
		return listAbogado;
	}
	public void setListAbogado(List<Abogado> listAbogado) {
		this.listAbogado = listAbogado;
	}
	public List<Especialidad> getListEspecialidad() {
		return listEspecialidad;
	}
	public void setListEspecialidad(List<Especialidad> listEspecialidad) {
		this.listEspecialidad = listEspecialidad;
	}
	public AbogadoController(IAbogadoService pkS, IEspecialidadService fkS, Abogado abogado, Especialidad especialidad,
			List<Abogado> listAbogado, List<Especialidad> listEspecialidad) {
		super();
		this.pkS = pkS;
		this.fkS = fkS;
		this.abogado = abogado;
		this.especialidad = especialidad;
		this.listAbogado = listAbogado;
		this.listEspecialidad = listEspecialidad;
	}
	public AbogadoController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
