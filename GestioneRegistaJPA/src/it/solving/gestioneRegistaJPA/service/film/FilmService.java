package it.solving.gestioneRegistaJPA.service.film;

import java.util.List;

import it.solving.gestioneRegistaJPA.dao.film.FilmDAO;
import it.solving.gestioneRegistaJPA.model.Film;

public interface FilmService {

	public void setFilmDAO(FilmDAO filmDAO);

	public List<Film> listAllFilm() throws Exception;

	public Film caricaSingoloFilm(Long id) throws Exception;

	public void aggiorna(Film filmInstance) throws Exception;

	public void inserisciNuovo(Film filmInstance) throws Exception;

	public void rimuovi(Film filmInstance) throws Exception;

	public List<Film> cercaPerTitolo(String titolo) throws Exception;

}
