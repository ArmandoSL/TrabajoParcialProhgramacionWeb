package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Requisito_legal;

public interface IRequisitoLegalDao {
	public void insertar(Requisito_legal requisito);

	public void eliminar(int idRequisito_legal);

	public void modificar(Requisito_legal requisito);

	public List<Requisito_legal> listar();
}
