package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IFleteDao;
import pe.edu.upc.entity.Flete;
import pe.edu.upc.service.IFleteService;

@Named
@RequestScoped
public class FleteServiceImpl implements IFleteService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IFleteDao fD;

	@Override
	public void insertar(Flete flete) {
		fD.insertar(flete);
	}

	@Override
	public void eliminar(int idFlete) {
		fD.eliminar(idFlete);
	}

	@Override
	public void modificar(Flete flete) {
		fD.modificar(flete);
	}

	@Override
	public List<Flete> listar() {
		return fD.listar();
	}

}
