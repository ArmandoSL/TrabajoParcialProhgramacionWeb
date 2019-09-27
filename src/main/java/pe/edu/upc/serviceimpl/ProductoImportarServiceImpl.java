package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IProductoImportarDao;
import pe.edu.upc.entity.ProductoImportar;
import pe.edu.upc.service.IProductoImportarService;

@Named
@RequestScoped
public class ProductoImportarServiceImpl implements IProductoImportarService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IProductoImportarDao piD;

	@Override
	public void insertar(ProductoImportar productoImportar) {
		piD.insertar(productoImportar);
	}

	@Override
	public void eliminar(int idProductoImportar) {
		piD.eliminar(idProductoImportar);
	}

	@Override
	public void modificar(ProductoImportar productoImportar) {
		piD.modificar(productoImportar);
	}

	@Override
	public List<ProductoImportar> listar() {
		return piD.listar();
	}

}
