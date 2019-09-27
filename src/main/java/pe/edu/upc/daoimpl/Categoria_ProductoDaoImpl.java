package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICategoria_ProductoDao;
import pe.edu.upc.entity.Categoria_Producto;

public class Categoria_ProductoDaoImpl implements ICategoria_ProductoDao, Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Categoria_Producto categoria_Producto) {
		try {
			em.persist(categoria_Producto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void eliminar(int idCategoria_Producto) {
		Categoria_Producto cat_pro = new Categoria_Producto();
<<<<<<< HEAD
		em.remove(cat_pro);
=======
>>>>>>> branch 'master' of https://github.com/ArmandoSL/TrabajoParcialProhgramacionWeb.git
		try {
			cat_pro = em.getReference(Categoria_Producto.class, idCategoria_Producto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Categoria_Producto categoria_Producto) {
		try {
			em.merge(categoria_Producto);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria_Producto> listar() {
		List<Categoria_Producto> lista = new ArrayList<>();
		try {
			Query q = em.createQuery("select a from Categoria_Producto a");
			lista = (List<Categoria_Producto>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
