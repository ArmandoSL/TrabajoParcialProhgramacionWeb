package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Informe_importacion;

public interface IDeclaracionAduaneraDao {

	public void insertar(Informe_importacion  declaracion_aduanera);

	public void eliminar(int idDeclaracion_aduanera);

	public void modificar(Informe_importacion declaracion_aduanera);

	public List<Informe_importacion> listar();
}
