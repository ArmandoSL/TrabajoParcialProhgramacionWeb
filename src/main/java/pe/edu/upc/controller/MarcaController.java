package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Marca;

import pe.edu.upc.service.IMarcaService;

@Named
@RequestScoped
public class MarcaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IMarcaService mService;
	private Marca marca;
	private String mensaje = "";
	List<Marca> listamarca;

	@PostConstruct
	public void init() {
		this.listamarca = new ArrayList<Marca>();
		this.marca = new Marca();
		this.lista();
	}

	public String newMarca() {
		this.setMarca(new Marca());
		return "RegistrarMarca.xhtml";
	}

	public void insertar() {
		try {
			mService.insertar(marca);
			
			mensaje = "Se registro correctamente";
			CleanMarca();
			this.lista();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void lista() {
		try {
			listamarca = mService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void CleanMarca() {
		this.init();
	}

	public void Eliminar(Marca marca) {
		try {
			mService.eliminar(marca.getIdMarca());
			lista();
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede eliminar";
		}
		this.CleanMarca();
	}

//////////////////////////////////////////7
	public IMarcaService getmService() {
		return mService;
	}

	public void setmService(IMarcaService mService) {
		this.mService = mService;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Marca> getListamarca() {
		return listamarca;
	}

	public void setListamarca(List<Marca> listamarca) {
		this.listamarca = listamarca;
	}

	public MarcaController(IMarcaService mService, Marca marca, String mensaje, List<Marca> listamarca) {
		super();
		this.mService = mService;
		this.marca = marca;
		this.mensaje = mensaje;
		this.listamarca = listamarca;
	}

	public MarcaController() {
		super();
		// TODO Auto-generated constructor stub
	}

}
