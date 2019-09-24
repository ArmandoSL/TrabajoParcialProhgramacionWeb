package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAbogadoDao;
import pe.edu.upc.entity.Abogado;
import pe.edu.upc.service.IAbogadoService;

@Named
@RequestScoped
public class AbogadoServiceImpl implements IAbogadoService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IAbogadoDao aD;
	@Override
	public void insertar(Abogado abogado) {
		aD.insertar(abogado);
	}
	@Override
	public List<Abogado> listar() {
		return aD.listar();
	}
	@Override
	public void eliminar(int idAbogado) {
		aD.eliminar(idAbogado);
	}
	@Override
	public void modificar(Abogado abogado) {
		aD.modificar(abogado);
	}
}
