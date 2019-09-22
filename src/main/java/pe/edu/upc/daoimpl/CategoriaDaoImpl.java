package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICategoriaDao;
import pe.edu.upc.entity.Categoria;

public class CategoriaDaoImpl implements ICategoriaDao,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;
	@Transactional
	@Override
	public void insertar(Categoria categoria) {
		try {
			em.persist(categoria);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void eliminar(int idCategoria) {
		Categoria categor = new Categoria();
		try {
			categor = em.getReference(Categoria.class, idCategoria);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	@Transactional
	@Override
	public void modificar(Categoria categoria) {
		try {
			em.merge(categoria);
		} catch (Exception e) {
			e.getMessage();
		}	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> listar() {

		List<Categoria>lista=new ArrayList<>();
		try {
			Query q=em.createQuery("select c from Categoria c");
			lista=(List<Categoria>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
	

}
