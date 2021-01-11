package it.solving.gestioneRegistaJPA.dao.regista;

import java.util.List;

import it.solving.gestioneRegistaJPA.dao.IBaseDAO;
import it.solving.gestioneRegistaJPA.model.Regista;

public interface RegistaDAO extends IBaseDAO<Regista> {

	public Regista getEagerFilm(Long id) throws Exception;

	public List<Regista> findMaggiorNumeroOScar() throws Exception;

	public Regista findByNome(String nome) throws Exception;

	public Regista findByCognomeIniziaPer(String input) throws Exception;

}
