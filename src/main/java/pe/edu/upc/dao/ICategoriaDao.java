package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Categoria;


public interface ICategoriaDao {

	public void insertar(Categoria categoria);

	public void eliminar(int idCategoria);

	public void modificar(Categoria categoria);

	public List<Categoria> listar();

}
