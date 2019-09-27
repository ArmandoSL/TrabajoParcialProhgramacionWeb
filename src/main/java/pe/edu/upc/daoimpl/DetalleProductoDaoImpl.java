package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDetalleProductoDao;
import pe.edu.upc.entity.DetalleProducto;

public class DetalleProductoDaoImpl implements Serializable, IDetalleProductoDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(DetalleProducto detalleProducto) {
		try {
			em.persist(detalleProducto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void eliminar(int idDetalleProducto) {
		DetalleProducto detallepro = new DetalleProducto();

		em.remove(detallepro);

		try {
			detallepro = em.getReference(DetalleProducto.class, idDetalleProducto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(DetalleProducto detalleProducto) {
		try {
			em.merge(detalleProducto);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DetalleProducto> listar() {

		List<DetalleProducto> lista = new ArrayList<>();
		try {
			Query q = em.createQuery("select a from DetalleProducto a");
			lista = (List<DetalleProducto>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;

	}

}
