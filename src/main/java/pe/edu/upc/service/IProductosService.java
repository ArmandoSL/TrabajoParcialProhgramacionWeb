package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ProductoImportar;

public interface IProductosService {

	public void insertar(ProductoImportar productos);

	public List<ProductoImportar> listar();

	public void eliminar(int idProductos);
}
