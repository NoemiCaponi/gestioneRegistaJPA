package it.solving.gestioneRegistaJPA.dao.film;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.solving.gestioneRegistaJPA.model.Film;

public class FilmDAOImpl implements FilmDAO {

	private EntityManager entityManager;

	@Override
	public List<Film> list() throws Exception {
		return entityManager.createQuery("from Film", Film.class).getResultList();
	}

	@Override
	public Film get(Long id) throws Exception {
		if (id < 1)
			throw new Exception("valore non valido");
		return entityManager.find(Film.class, id);
	}

	@Override
	public void update(Film input) throws Exception {
		if (input == null)
			throw new Exception("Valore di input non ammesso");
		input = entityManager.merge(input);
	}

	@Override
	public void insert(Film input) throws Exception {
		if (input == null)
			throw new Exception("Valore di input non ammesso");
		entityManager.persist(input);
	}

	@Override
	public void delete(Film input) throws Exception {
		if (input == null)
			throw new Exception("Valore di input non ammesso");
		entityManager.remove(entityManager.merge(input));

	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;

	}

	@Override
	public List<Film> findAllByTitolo(String titolo) throws Exception {
		if (titolo == null || titolo == "")
			throw new Exception("Valore di input non valido");
		TypedQuery<Film> query = entityManager.createQuery("from Film f where f.titolo like ?1", Film.class);
		return query.setParameter(1, titolo).getResultList();

	}

}
