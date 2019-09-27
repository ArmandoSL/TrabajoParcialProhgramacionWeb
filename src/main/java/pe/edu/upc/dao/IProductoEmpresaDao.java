package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ProductoEmpresa;

public interface IProductoEmpresaDao {

	public void insertar(ProductoEmpresa productoEmp);

	public void eliminar(int idproductoEmp);

	public void modificar(ProductoEmpresa productoEmp);

	public List<ProductoEmpresa> listar();
}
