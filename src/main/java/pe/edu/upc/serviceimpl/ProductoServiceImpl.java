package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IProductoDao;
import pe.edu.upc.entity.Producto;
import pe.edu.upc.service.IProductoService;

@Named
@RequestScoped
public class ProductoServiceImpl implements IProductoService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IProductoDao peD;

	@Override
	public void insertar(Producto productoEmp) {
		peD.insertar(productoEmp);
	}

	@Override
	public void eliminar(int idproductoEmp) {
		peD.eliminar(idproductoEmp);
	}

	@Override
	public void modificar(Producto productoEmp) {
		peD.modificar(productoEmp);
	}

	@Override
	public List<Producto> listar() {
		return peD.listar();
	}

}
