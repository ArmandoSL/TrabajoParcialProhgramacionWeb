package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDeclaracionAduaneraDao;
import pe.edu.upc.entity.Informe_importacion;
import pe.edu.upc.service.IDeclaracionAduaneraService;

@Named
@RequestScoped
public class DeclaracionAduaneraServiceImpl implements IDeclaracionAduaneraService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IDeclaracionAduaneraDao daD;
	
	@Override
	public void insertar(Informe_importacion declaracion_aduanera) {
		daD.insertar(declaracion_aduanera);
	}

	@Override
	public void eliminar(int idDeclaracion_aduanera) {
		daD.eliminar(idDeclaracion_aduanera);
	}

	@Override
	public void modificar(Informe_importacion declaracion_aduanera) {
		daD.modificar(declaracion_aduanera);
	}

	@Override
	public List<Informe_importacion> listar() {
		return daD.listar();
	}

}
