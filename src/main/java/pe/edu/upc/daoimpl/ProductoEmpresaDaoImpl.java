package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProductoEmpresaDao;
import pe.edu.upc.entity.ProductoEmpresa;

public class ProductoEmpresaDaoImpl implements Serializable,IProductoEmpresaDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;
	@Transactional
	@Override
	public void insertar(ProductoEmpresa productoEmp) {
		try {
			em.persist(productoEmp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	@Transactional
	@Override
	public void eliminar(int idproductoEmp) {
		ProductoEmpresa productoEmp = new ProductoEmpresa();
		try {
			productoEmp = em.getReference(ProductoEmpresa.class, idproductoEmp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	@Transactional
	@Override
	public void modificar(ProductoEmpresa productoEmp) {
		try {
			em.merge(productoEmp);
		} catch (Exception e) {
			e.getMessage();
		}
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductoEmpresa> listar() {
		List<ProductoEmpresa>lista=new ArrayList<>();
		try {
			Query q=em.createQuery("select a from ProductoEmpresa a");
			lista=(List<ProductoEmpresa>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	

}
