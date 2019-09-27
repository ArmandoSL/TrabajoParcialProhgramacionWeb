package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITransportistaDao;
import pe.edu.upc.entity.Transportista;

public class TransportistaDaoImpl implements Serializable, ITransportistaDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Transportista transportista) {
		try {
			em.persist(transportista);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void eliminar(int idTransportista) {
		Transportista abog = new Transportista();
<<<<<<< HEAD
		em.remove(abog);
=======
>>>>>>> branch 'master' of https://github.com/ArmandoSL/TrabajoParcialProhgramacionWeb.git
		try {
			abog = em.getReference(Transportista.class, idTransportista);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Transportista transportista) {
		try {
			em.merge(transportista);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transportista> listar() {
		List<Transportista> lista = new ArrayList<>();
		try {
			Query q = em.createQuery("select a from Transportista a");
			lista = (List<Transportista>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
