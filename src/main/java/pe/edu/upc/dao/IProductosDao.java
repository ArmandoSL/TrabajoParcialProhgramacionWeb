package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ProductoImportar;

public interface IProductosDao {

	public void insertar(ProductoImportar productos);

	public List<ProductoImportar> listar();

	public void eliminar(int idProductos);
}
