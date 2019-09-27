package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Transportista;
import pe.edu.upc.service.ITransportistaService;

@Named
@RequestScoped
public class TransportistaController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private ITransportistaService tService;
	private Transportista transportista;
	private String mensaje = "";
	List<Transportista> listatransportista;

	@PostConstruct
	public void init() {
		this.listatransportista = new ArrayList<Transportista>();
		this.transportista = new Transportista();
		this.lista();
	}

	public String newTransportista() {
		this.setTransportista(new Transportista());
		return ".xhtml";
	}

	public void insertar() {
		try {
			tService.insertar(transportista);
			mensaje = "Se registró correctamente";
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void lista() {
		try {
			listatransportista = tService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void CleanTransportista() {
		this.init();
	}
	
	public void eliminar(Transportista transportista) {
		try {
			tService.eliminar(transportista.getIdTransportista());
		} catch (Exception e) {
			e.getMessage();
			mensaje="No se puede eliminar";
		}
	}

	public ITransportistaService gettService() {
		return tService;
	}

	public void settService(ITransportistaService tService) {
		this.tService = tService;
	}

	public Transportista getTransportista() {
		return transportista;
	}

	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Transportista> getListatransportista() {
		return listatransportista;
	}

	public void setListatransportista(List<Transportista> listatransportista) {
		this.listatransportista = listatransportista;
	}

	public TransportistaController(ITransportistaService tService, Transportista transportista, String mensaje,
			List<Transportista> listatransportista) {
		super();
		this.tService = tService;
		this.transportista = transportista;
		this.mensaje = mensaje;
		this.listatransportista = listatransportista;
	}

	public TransportistaController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
