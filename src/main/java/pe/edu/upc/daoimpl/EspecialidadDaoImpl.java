package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEspecialidadDao;
import pe.edu.upc.entity.Especialidad;

public class EspecialidadDaoImpl implements IEspecialidadDao,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Especialidad especialidad) {
		try {
			em.persist(especialidad);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void eliminar(int idEspecialidad) {
		Especialidad especi = new Especialidad();
		try {
			especi = em.getReference(Especialidad.class, idEspecialidad);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	@Transactional
	@Override
	public void modificar(Especialidad especialidad) {
		try {
			em.merge(especialidad);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Especialidad> listar() {
		List<Especialidad>lista=new ArrayList<>();
		try {
			Query q=em.createQuery("select e from Especialidad e");
			lista=(List<Especialidad>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	
	
}
