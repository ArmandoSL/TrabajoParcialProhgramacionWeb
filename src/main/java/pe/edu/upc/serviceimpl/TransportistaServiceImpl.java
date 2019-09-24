package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITransportistaDao;
import pe.edu.upc.entity.Transportista;
import pe.edu.upc.service.ITransportistaService;

@Named
@RequestScoped
public class TransportistaServiceImpl implements ITransportistaService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private ITransportistaDao tD;

	@Override
	public void insertar(Transportista transportista) {
		tD.insertar(transportista);
	}

	@Override
	public void eliminar(int idTransportista) {
		tD.eliminar(idTransportista);
	}

	@Override
	public void modificar(Transportista transportista) {
		tD.modificar(transportista);
	}

	@Override
	public List<Transportista> listar() {
		return tD.listar();
	}

}
