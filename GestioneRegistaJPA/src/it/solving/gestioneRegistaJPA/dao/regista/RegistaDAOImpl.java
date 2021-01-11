package it.solving.gestioneRegistaJPA.dao.regista;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.solving.gestioneRegistaJPA.model.Regista;

public class RegistaDAOImpl implements RegistaDAO {

	private EntityManager entityManager;

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;

	}

	@Override
	public List<Regista> list() throws Exception {

		return entityManager.createQuery("from Regista", Regista.class).getResultList();
	}

	@Override
	public Regista get(Long id) throws Exception {
		if (id == null || id < 1)
			throw new Exception("valore non valido");
		return entityManager.find(Regista.class, id);

	}

	@Override
	public void update(Regista input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		input = entityManager.merge(input);

	}

	@Override
	public void insert(Regista input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(input);

	}

	@Override
	public void delete(Regista input) throws Exception {
		if (input == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(input));

	}

	public Regista getEagerFilm(Long id) throws Exception {
		// join fetch come sopra ma valorizza anche la lista di film (EAGER)
		// left join fetch come sopra ma cerca anche tra i registi privi di film (EAGER)
		TypedQuery<Regista> query = entityManager
				.createQuery("from Regista r left join fetch r.filmografia where r.id = ?1", Regista.class);
		query.setParameter(1, id);
		return query.getResultStream().findFirst().orElse(null);
	}

	@Override
	public List<Regista> findMaggiorNumeroOScar() throws Exception {
		TypedQuery<Regista> query = entityManager.createQuery(
				"from Regista r where r.numeroOscarVinti=(SELECT MAX(numeroOscarVinti) FROM Regista)", Regista.class);
		return query.getResultList();

	}

	@Override
	public Regista findByNome(String nome) throws Exception {
		TypedQuery<Regista> query = entityManager.createQuery("from Regista r where r.nome like ?1", Regista.class);
		return query.setParameter(1, nome).getSingleResult();
	}

	@Override
	public Regista findByCognomeIniziaPer(String input) throws Exception {
		TypedQuery<Regista> query = entityManager.createQuery("from Regista r where r.cognome like ?1", Regista.class);
		return query.setParameter(1, input + "%").getSingleResult();
	}

}
