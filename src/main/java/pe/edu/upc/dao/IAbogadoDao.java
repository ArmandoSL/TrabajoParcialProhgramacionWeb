package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Abogado;

public interface IAbogadoDao {
	public void insertar(Abogado abogado );

	public void eliminar(int idAbogado);

	public void modificar(Abogado abogado );

	public List<Abogado> listar();
}
