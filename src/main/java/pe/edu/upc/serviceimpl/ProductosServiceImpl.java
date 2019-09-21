package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IProductosDao;
import pe.edu.upc.entity.ProductoImportar;
import pe.edu.upc.service.IProductosService;

public class ProductosServiceImpl implements IProductosService {

	@Inject
	private IProductosDao mD;

	@Override
	public void insertar(ProductoImportar productos) {
		try {
			mD.insertar(productos);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public List<ProductoImportar> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idProductos) {
		mD.eliminar(idProductos);

	}

}
