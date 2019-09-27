package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ILineaPedidoDao;
import pe.edu.upc.entity.LineadePedido;

public class LineaPedidosDaoImpl implements ILineaPedidoDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(LineadePedido lineadePedido) {
		try {
			em.persist(lineadePedido);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void eliminar(int lineadePedido) {

		LineadePedido lineapedi = new LineadePedido();
		em.remove(lineapedi);
		try {
			lineapedi = em.getReference(LineadePedido.class, lineadePedido);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void modificar(LineadePedido lineadePedido) {
		try {
			em.merge(lineadePedido);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LineadePedido> listar() {

		List<LineadePedido> lista = new ArrayList<>();
		try {
			Query q = em.createQuery("select a from LineadePedido a");
			lista = (List<LineadePedido>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
