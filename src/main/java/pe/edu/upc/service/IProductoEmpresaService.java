package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ProductoEmpresa;

public interface IProductoEmpresaService {
	public void insertar(ProductoEmpresa productoEmp);

	public void eliminar(int idproductoEmp);

	public void modificar(ProductoEmpresa productoEmp);

	public List<ProductoEmpresa> listar();
}
