package it.solving.gestioneRegistaJPA.service.regista;

import java.util.List;

import javax.persistence.EntityManager;

import it.solving.gestioneRegistaJPA.dao.EntityManagerUtil;
import it.solving.gestioneRegistaJPA.dao.regista.RegistaDAO;
import it.solving.gestioneRegistaJPA.model.Regista;

public class RegistaServiceImpl implements RegistaService {

	private RegistaDAO registaDAO;

	@Override
	public void setRegistaDAO(RegistaDAO registaDao) {
		this.registaDAO = registaDao;

	}

	@Override
	public List<Regista> listAllRegisti() throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);
			return registaDAO.list();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public Regista caricaSingoloRegista(Long id) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);
			return registaDAO.get(id);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public Regista caricaSingoloRegistaoConFilm(Long id) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);
			return registaDAO.getEagerFilm(id);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public void aggiorna(Regista registaInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			entityManager.getTransaction().begin();
			registaDAO.setEntityManager(entityManager);
			registaDAO.update(registaInstance);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}

	}

	@Override
	public void inserisciNuovo(Regista registaInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			entityManager.getTransaction().begin();
			registaDAO.setEntityManager(entityManager);
			registaDAO.insert(registaInstance);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}

	}

	@Override
	public void rimuovi(Regista registaInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			entityManager.getTransaction().begin();
			registaDAO.setEntityManager(entityManager);
			registaDAO.delete(registaInstance);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}

	}

	@Override
	public List<Regista> trovaMaggiorNumeroOSccar() throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);
			return registaDAO.findMaggiorNumeroOScar();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public Regista trovaPerNome(String nome) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);
			return registaDAO.findByNome(nome);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public Regista trovaRegistaCognomeIniziaPer(String input) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			registaDAO.setEntityManager(entityManager);
			return registaDAO.findByCognomeIniziaPer(input);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			entityManager.close();
		}
	}

}
