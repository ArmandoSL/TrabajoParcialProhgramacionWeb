package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Producto;

public interface IProductoService {
	public void insertar(Producto productoEmp);

	public void eliminar(int idproductoEmp);

	public void modificar(Producto productoEmp);

	public List<Producto> listar();
}
