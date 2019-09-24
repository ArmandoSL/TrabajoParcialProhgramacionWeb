package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProductoImportarDao;
import pe.edu.upc.entity.ProductoImportar;

public class ProductoImportarDaoImpl implements Serializable,IProductoImportarDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;
	@Transactional
	@Override
	public void insertar(ProductoImportar productoImportar) {
		try {
			em.persist(productoImportar);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	@Transactional
	@Override
	public void eliminar(int idProductoImportar) {
		ProductoImportar productoImportar = new ProductoImportar();
		try {
			productoImportar = em.getReference(ProductoImportar.class, idProductoImportar);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	@Transactional
	@Override
	public void modificar(ProductoImportar productoImportar) {
		try {
			em.merge(productoImportar);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductoImportar> listar() {
		List<ProductoImportar>lista=new ArrayList<>();
		try {
			Query q=em.createQuery("select a from ProductoImportar a");
			lista=(List<ProductoImportar>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;

	}
	

}
