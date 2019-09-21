package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProductosDao;
import pe.edu.upc.entity.ProductoImportar;

public class ProductosDaoImpl implements IProductosDao {

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(ProductoImportar productos) {
		try {
			em.persist(productos);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductoImportar> listar() {
		List<ProductoImportar> lista = new ArrayList<ProductoImportar>();
		try {
			Query q = em.createQuery("select p from Productos p");
			lista = (List<ProductoImportar>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Override
	public void eliminar(int idProductos) {
		ProductoImportar prod = new ProductoImportar();
		try {
			prod = em.getReference(ProductoImportar.class, idProductos);
			em.remove(prod);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
