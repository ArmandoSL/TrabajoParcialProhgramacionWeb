package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.LineadePedido;

public interface ILineaPedidoDao {
	public void insertar(LineadePedido lineadePedido);

	public void eliminar(int lineadePedido);

	public void modificar(LineadePedido lineadePedido);

	public List<LineadePedido> listar();
}
