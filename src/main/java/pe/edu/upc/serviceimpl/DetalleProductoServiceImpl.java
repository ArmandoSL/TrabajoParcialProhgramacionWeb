package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDetalleProductoDao;
import pe.edu.upc.entity.DetalleProducto;
import pe.edu.upc.service.IDetalleProductoService;

@Named
@RequestScoped
public class DetalleProductoServiceImpl implements IDetalleProductoService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IDetalleProductoDao dpD;
	
	@Override
	public void insertar(DetalleProducto detalleProducto) {
		dpD.insertar(detalleProducto);
	}

	@Override
	public void eliminar(int idDetalleProducto) {
		dpD.eliminar(idDetalleProducto);
	}

	@Override
	public void modificar(DetalleProducto detalleProducto) {
		dpD.modificar(detalleProducto);
	}

	@Override
	public List<DetalleProducto> listar() {
		return dpD.listar();
	}

}
