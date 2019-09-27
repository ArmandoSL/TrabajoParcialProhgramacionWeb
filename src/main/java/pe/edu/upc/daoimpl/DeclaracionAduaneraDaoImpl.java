package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDeclaracionAduaneraDao;
import pe.edu.upc.entity.Informe_importacion;

public class DeclaracionAduaneraDaoImpl implements Serializable, IDeclaracionAduaneraDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Informe_importacion Declaracion_aduanera) {
		try {
			em.persist(Declaracion_aduanera);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void eliminar(int idDeclaracion_aduanera) {
		Informe_importacion declara = new Informe_importacion();

		em.remove(declara);

		try {
			declara = em.getReference(Informe_importacion.class, idDeclaracion_aduanera);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Informe_importacion declaracion_aduanera) {
		try {
			em.merge(declaracion_aduanera);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Informe_importacion> listar() {
		List<Informe_importacion> lista = new ArrayList<>();
		try {
			Query q = em.createQuery("select a from DeclaracionAduanera a");
			lista = (List<Informe_importacion>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
