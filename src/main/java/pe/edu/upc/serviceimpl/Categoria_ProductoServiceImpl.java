package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICategoria_ProductoDao;
import pe.edu.upc.entity.Categoria_Producto;
import pe.edu.upc.service.ICategoria_ProductoService;

@Named
@RequestScoped
public class Categoria_ProductoServiceImpl implements ICategoria_ProductoService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private ICategoria_ProductoDao cpD;
	@Override
	public void insertar(Categoria_Producto categoria_Producto) {
		cpD.insertar(categoria_Producto);
	}

	@Override
	public void eliminar(int idCategoria_Producto) {
		cpD.eliminar(idCategoria_Producto);
	}

	@Override
	public void modificar(Categoria_Producto categoria_Producto) {
		cpD.modificar(categoria_Producto);
	}

	@Override
	public List<Categoria_Producto> listar() {
		return cpD.listar();
	}

}
