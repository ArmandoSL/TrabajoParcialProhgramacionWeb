package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMarcaDao;
import pe.edu.upc.entity.Marca;
import pe.edu.upc.service.IMarcaService;

@Named
@RequestScoped
public class MarcaServiceImpl implements IMarcaService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IMarcaDao mD;

	@Override
	public void insertar(Marca marca) {
		mD.insertar(marca);
	}

	@Override
	public List<Marca> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idMarca) {
		mD.eliminar(idMarca);
	}

	@Override
	public void modificar(Marca marca) {
		mD.modificar(marca);
	}

}
