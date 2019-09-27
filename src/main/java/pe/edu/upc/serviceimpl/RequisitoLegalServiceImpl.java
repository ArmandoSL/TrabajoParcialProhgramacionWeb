package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRequisitoLegalDao;
import pe.edu.upc.entity.Requisito_legal;
import pe.edu.upc.service.IRequisitoLegalService;

@Named
@RequestScoped
public class RequisitoLegalServiceImpl implements IRequisitoLegalService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IRequisitoLegalDao rlD;

	@Override
	public void insertar(Requisito_legal requisito) {
		rlD.insertar(requisito);
	}

	@Override
	public void eliminar(int idRequisito_legal) {
		rlD.eliminar(idRequisito_legal);
	}

	@Override
	public void modificar(Requisito_legal requisito) {
		rlD.modificar(requisito);
	}

	@Override
	public List<Requisito_legal> listar() {
		return rlD.listar();
	}

}
