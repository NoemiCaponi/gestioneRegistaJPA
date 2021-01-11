package it.solving.gestioneRegistaJPA.service;

import it.solving.gestioneRegistaJPA.dao.MyDaoFactory;
import it.solving.gestioneRegistaJPA.service.film.FilmService;
import it.solving.gestioneRegistaJPA.service.film.FilmServiceImpl;
import it.solving.gestioneRegistaJPA.service.regista.RegistaService;
import it.solving.gestioneRegistaJPA.service.regista.RegistaServiceImpl;

public class MyServiceFactory {
	private static FilmService filmServiceInstance = null;
	private static RegistaService registaServiceInstance = null;

	public static FilmService getFilmServiceInstance() {
		if (filmServiceInstance == null) {
			filmServiceInstance = new FilmServiceImpl();
			filmServiceInstance.setFilmDAO(MyDaoFactory.getFilmDAOInstance());
		}
		return filmServiceInstance;
	}

	public static RegistaService getRegistaServiceInstance() {
		if (registaServiceInstance == null) {
			registaServiceInstance = new RegistaServiceImpl();
			registaServiceInstance.setRegistaDAO(MyDaoFactory.getRegistaDAOInstance());
		}
		return registaServiceInstance;
	}

}
