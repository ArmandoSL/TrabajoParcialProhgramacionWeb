package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ILineaPedidoDao;
import pe.edu.upc.entity.LineadePedido;
import pe.edu.upc.service.ILineaPedidoService;

@Named
@RequestScoped
public class LineaPedidoServiceImpl implements ILineaPedidoService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private ILineaPedidoDao lpD;

	@Override
	public void insertar(LineadePedido lineadePedido) {
		lpD.insertar(lineadePedido);
	}

	@Override
	public void eliminar(int lineadePedido) {
		lpD.eliminar(lineadePedido);
	}

	@Override
	public void modificar(LineadePedido lineadePedido) {
		lpD.modificar(lineadePedido);
	}

	@Override
	public List<LineadePedido> listar() {
		return lpD.listar();
	}

}
