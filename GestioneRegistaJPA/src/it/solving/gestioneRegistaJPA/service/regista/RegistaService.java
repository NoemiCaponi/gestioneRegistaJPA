package it.solving.gestioneRegistaJPA.service.regista;

import java.util.List;

import it.solving.gestioneRegistaJPA.dao.regista.RegistaDAO;
import it.solving.gestioneRegistaJPA.model.Regista;

public interface RegistaService {

	public void setRegistaDAO(RegistaDAO registaDao);

	public List<Regista> listAllRegisti() throws Exception;

	public Regista caricaSingoloRegista(Long id) throws Exception;

	public Regista caricaSingoloRegistaoConFilm(Long id) throws Exception;

	public void aggiorna(Regista registaInstance) throws Exception;

	public void inserisciNuovo(Regista registaInstance) throws Exception;

	public void rimuovi(Regista registaInstance) throws Exception;

	public List<Regista> trovaMaggiorNumeroOSccar() throws Exception;

	public Regista trovaPerNome(String nome) throws Exception;

	public Regista trovaRegistaCognomeIniziaPer(String input) throws Exception;

}
