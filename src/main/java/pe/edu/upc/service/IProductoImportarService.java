package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ProductoImportar;

public interface IProductoImportarService {
	public void insertar(ProductoImportar productoImportar);

	public void eliminar(int idProductoImportar);

	public void modificar(ProductoImportar productoImportar);

	public List<ProductoImportar> listar();
}
