package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Abogado;

public interface IAbogadoService {
	public void insertar(Abogado abogado);

	public List<Abogado> listar();

	public void eliminar(int idAbogado);

	public void modificar(Abogado abogado);
}
