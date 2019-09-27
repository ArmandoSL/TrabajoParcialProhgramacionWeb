package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProductoDao;
import pe.edu.upc.entity.Producto;

public class ProductoDaoImpl implements Serializable, IProductoDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Producto productoEmp) {
		try {
			em.persist(productoEmp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void eliminar(int idproductoEmp) {
		Producto productoEmp = new Producto();
		em.remove(productoEmp);
		try {
			productoEmp = em.getReference(Producto.class, idproductoEmp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Producto productoEmp) {
		try {
			em.merge(productoEmp);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> listar() {
		List<Producto> lista = new ArrayList<>();
		try {
			Query q = em.createQuery("select a from ProductoEmpresa a");
			lista = (List<Producto>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
