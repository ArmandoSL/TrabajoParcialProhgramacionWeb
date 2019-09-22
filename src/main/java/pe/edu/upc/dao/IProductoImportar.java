package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ProductoImportar;

public interface IProductoImportar {

	public void insertar(ProductoImportar productoImportar);

	public void eliminar(int idProductoImportar);

	public void modificar(ProductoImportar productoImportar);

	public List<ProductoImportar> listar();
}
