package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.LineadePedido;
import pe.edu.upc.service.ILineaPedidoService;

@Named
@RequestScoped
public class LineaPedidoController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private ILineaPedidoService lpService;
	private LineadePedido lineapedido;
	private String mensaje="";
	List<LineadePedido>listalineapedido;
	
	@PostConstruct
	public void init() {
		this.listalineapedido=new ArrayList<LineadePedido>();
		this.lineapedido=new LineadePedido();
		
	}
	
	public String newLineaPedido() {
		this.setLineapedido(new LineadePedido());
		return ".xhtml";
	}

	public void insertar() {
		try {
			lpService.insertar(lineapedido);
			mensaje="Se registró correctamente";
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public void lista() {
		try {
			listalineapedido=lpService.listar();
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public void CleanLineaPedido() {
		this.init();
	}
	
	public void eliminar(LineadePedido lineapedido) {
		try {
			lpService.eliminar(lineapedido.getIdLineadepedido());
		}catch(Exception e) {
			e.getMessage();
			mensaje="No se puede eliminar";
		}
	}
	
	public ILineaPedidoService getLpService() {
		return lpService;
	}

	public void setLpService(ILineaPedidoService lpService) {
		this.lpService = lpService;
	}

	public LineadePedido getLineapedido() {
		return lineapedido;
	}

	public void setLineapedido(LineadePedido lineapedido) {
		this.lineapedido = lineapedido;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<LineadePedido> getListalineapedido() {
		return listalineapedido;
	}

	public void setListalineapedido(List<LineadePedido> listalineapedido) {
		this.listalineapedido = listalineapedido;
	}

	public LineaPedidoController(ILineaPedidoService lpService, LineadePedido lineapedido, String mensaje,
			List<LineadePedido> listalineapedido) {
		super();
		this.lpService = lpService;
		this.lineapedido = lineapedido;
		this.mensaje = mensaje;
		this.listalineapedido = listalineapedido;
	}

	public LineaPedidoController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
