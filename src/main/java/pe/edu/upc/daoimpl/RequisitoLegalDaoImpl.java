package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRequisitoLegalDao;
import pe.edu.upc.entity.Requisito_legal;

public class RequisitoLegalDaoImpl implements Serializable,IRequisitoLegalDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;
	@Transactional
	@Override
	public void insertar(Requisito_legal requisito) {
		try {
			em.persist(requisito);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void eliminar(int idRequisito_legal) {
		Requisito_legal abog = new Requisito_legal();
<<<<<<< HEAD
		em.remove(abog);
=======
>>>>>>> branch 'master' of https://github.com/ArmandoSL/TrabajoParcialProhgramacionWeb.git
		try {
			abog = em.getReference(Requisito_legal.class, idRequisito_legal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void modificar(Requisito_legal requisito) {
		try {
			em.merge(requisito);
		} catch (Exception e) {
			e.getMessage();
		}	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Requisito_legal> listar() {
		List<Requisito_legal>lista=new ArrayList<>();
		try {
			Query q=em.createQuery("select a from Requisitos_legales a");
			lista=(List<Requisito_legal>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;

	}

	
	
}
