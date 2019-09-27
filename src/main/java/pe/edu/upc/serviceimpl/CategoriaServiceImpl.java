package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICategoriaDao;
import pe.edu.upc.entity.Categoria;
import pe.edu.upc.service.ICategoriaService;

@Named
@RequestScoped
public class CategoriaServiceImpl implements ICategoriaService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private ICategoriaDao cD;

	@Override
	public void insertar(Categoria categoria) {
		cD.insertar(categoria);
	}

	@Override
	public void eliminar(int idCategoria) {
		cD.eliminar(idCategoria);
	}

	@Override
	public void modificar(Categoria categoria) {
		cD.modificar(categoria);
	}

	@Override
	public List<Categoria> listar() {
		return cD.listar();
	}

}
