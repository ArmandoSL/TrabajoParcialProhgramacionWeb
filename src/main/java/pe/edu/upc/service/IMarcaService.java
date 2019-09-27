package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Marca;

public interface IMarcaService {
	public void insertar(Marca marca);

	public List<Marca> listar();

	public void eliminar(int idMarca);

	public void modificar(Marca marca);
}
