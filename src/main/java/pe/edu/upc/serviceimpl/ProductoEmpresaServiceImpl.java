package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IProductoEmpresaDao;
import pe.edu.upc.entity.ProductoEmpresa;
import pe.edu.upc.service.IProductoEmpresaService;

@Named
@RequestScoped
public class ProductoEmpresaServiceImpl implements IProductoEmpresaService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IProductoEmpresaDao peD;

	@Override
	public void insertar(ProductoEmpresa productoEmp) {
		peD.insertar(productoEmp);
	}

	@Override
	public void eliminar(int idproductoEmp) {
		peD.eliminar(idproductoEmp);
	}

	@Override
	public void modificar(ProductoEmpresa productoEmp) {
		peD.modificar(productoEmp);
	}

	@Override
	public List<ProductoEmpresa> listar() {
		return peD.listar();
	}

}
