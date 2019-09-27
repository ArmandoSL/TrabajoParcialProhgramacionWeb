package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMarcaDao;
import pe.edu.upc.entity.Marca;

public class MarcaDaoImpl implements IMarcaDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Marca marca) {
		try {
			em.persist(marca);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void eliminar(int idMarca) {
		Marca marca = new Marca();

		em.remove(marca);
		try {
			marca = em.getReference(Marca.class, idMarca);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Marca marca) {

		try {
			em.merge(marca);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Marca> listar() {
		List<Marca> lista = new ArrayList<>();
		try {
			Query q = em.createQuery("select m from Marca m");
			lista = (List<Marca>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
