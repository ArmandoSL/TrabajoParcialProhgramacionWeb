package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Categoria_Producto;

public interface ICategoria_ProductoDao {

	public void insertar(Categoria_Producto categoria_Producto );

	public void eliminar(int idCategoria_Producto);

	public void modificar(Categoria_Producto categoria_Producto );

	public List<Categoria_Producto> listar();
}
