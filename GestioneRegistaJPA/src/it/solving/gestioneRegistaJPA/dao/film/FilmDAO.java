package it.solving.gestioneRegistaJPA.dao.film;

import java.util.List;

import it.solving.gestioneRegistaJPA.dao.IBaseDAO;
import it.solving.gestioneRegistaJPA.model.Film;

public interface FilmDAO extends IBaseDAO<Film> {

	public List<Film> findAllByTitolo(String titolo) throws Exception;

}
