package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Declaracion_aduanera;

public interface IDeclaracionAduaneraService {
	public void insertar(Declaracion_aduanera  declaracion_aduanera);

	public void eliminar(int idDeclaracion_aduanera);

	public void modificar(Declaracion_aduanera declaracion_aduanera);

	public List<Declaracion_aduanera> listar();
}
