package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Transportista;

public interface ITransportistaService {
	public void insertar(Transportista transportista);

	public void eliminar(int idTransportista);

	public void modificar(Transportista transportista);

	public List<Transportista> listar();
}
