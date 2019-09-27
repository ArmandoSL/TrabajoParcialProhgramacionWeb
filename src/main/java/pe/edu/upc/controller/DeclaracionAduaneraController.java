package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Informe_importacion;
import pe.edu.upc.service.IDeclaracionAduaneraService;

@Named
@RequestScoped
public class DeclaracionAduaneraController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IDeclaracionAduaneraService daService;
	private Informe_importacion informeimp;
	private String mensaje = "";
	List<Informe_importacion> listadeclaracion;

	@PostConstruct
	public void init() {
		this.listadeclaracion = new ArrayList<Informe_importacion>();
		this.informeimp = new Informe_importacion();
	}

	public String newDeclaracionAduanera() {
		this.setInformeimp(new Informe_importacion());
		return ".xhtml";
	}

	public void insertar() {
		try {
			daService.insertar(informeimp);
			mensaje = "Se registró correctamente";
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void lista() {
		try {
			listadeclaracion = daService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void CleanDeclaracionAduanera() {
		this.init();
	}

	public void eliminar(Informe_importacion informeimp) {
		try {
			daService.eliminar(informeimp.getIdInformeImportacion());
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede eliminar";
		}
	}

	public IDeclaracionAduaneraService getDaService() {
		return daService;
	}

	public void setDaService(IDeclaracionAduaneraService daService) {
		this.daService = daService;
	}

	public Informe_importacion getInformeimp() {
		return informeimp;
	}

	public void setInformeimp(Informe_importacion informeimp) {
		this.informeimp = informeimp;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Informe_importacion> getListadeclaracion() {
		return listadeclaracion;
	}

	public void setListadeclaracion(List<Informe_importacion> listadeclaracion) {
		this.listadeclaracion = listadeclaracion;
	}

	public DeclaracionAduaneraController(IDeclaracionAduaneraService daService, Informe_importacion informeimp,
			String mensaje, List<Informe_importacion> listadeclaracion) {
		super();
		this.daService = daService;
		this.informeimp = informeimp;
		this.mensaje = mensaje;
		this.listadeclaracion = listadeclaracion;
	}

	public DeclaracionAduaneraController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
