package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IFleteDao;
import pe.edu.upc.entity.Flete;

public class FleteDaoImpl implements Serializable, IFleteDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Flete flete) {
		try {
			em.persist(flete);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void eliminar(int idFlete) {
		Flete flete = new Flete();

		em.remove(flete);

		try {
			flete = em.getReference(Flete.class, idFlete);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Flete flete) {
		try {
			em.merge(flete);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Flete> listar() {
		List<Flete> lista = new ArrayList<>();
		try {
			Query q = em.createQuery("select a from Flete a");
			lista = (List<Flete>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;

	}

}
