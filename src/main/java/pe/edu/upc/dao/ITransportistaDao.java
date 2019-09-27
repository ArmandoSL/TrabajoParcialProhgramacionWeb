package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Transportista;

public interface ITransportistaDao {

	public void insertar(Transportista transportista);

	public void eliminar(int idTransportista);

	public void modificar(Transportista transportista);

	public List<Transportista> listar();
}
