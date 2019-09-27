package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Flete;

public interface IFleteService {
	public void insertar(Flete flete);

	public void eliminar(int idFlete);

	public void modificar(Flete flete);

	public List<Flete> listar();
}
