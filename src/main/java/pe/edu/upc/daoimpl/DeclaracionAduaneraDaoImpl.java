package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDeclaracionAduaneraDao;
import pe.edu.upc.entity.Declaracion_aduanera;

public class DeclaracionAduaneraDaoImpl implements Serializable, IDeclaracionAduaneraDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Declaracion_aduanera Declaracion_aduanera) {
		try {
			em.persist(Declaracion_aduanera);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void eliminar(int idDeclaracion_aduanera) {
		Declaracion_aduanera declara = new Declaracion_aduanera();
		try {
			declara = em.getReference(Declaracion_aduanera.class, idDeclaracion_aduanera);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Declaracion_aduanera declaracion_aduanera) {
		try {
			em.merge(declaracion_aduanera);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Declaracion_aduanera> listar() {
		List<Declaracion_aduanera> lista = new ArrayList<>();
		try {
			Query q = em.createQuery("select a from DeclaracionAduanera a");
			lista = (List<Declaracion_aduanera>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
