package it.solving.gestioneRegistaJPA.dao;

import it.solving.gestioneRegistaJPA.dao.film.FilmDAO;
import it.solving.gestioneRegistaJPA.dao.film.FilmDAOImpl;
import it.solving.gestioneRegistaJPA.dao.regista.RegistaDAO;
import it.solving.gestioneRegistaJPA.dao.regista.RegistaDAOImpl;

public class MyDaoFactory {
	
		private static FilmDAO filmDAOInstance = null;
		private static RegistaDAO registaDAOInstance = null;

		public static FilmDAO getFilmDAOInstance() {
			if (filmDAOInstance == null)
				filmDAOInstance = new FilmDAOImpl();
			return filmDAOInstance;
		}

		public static RegistaDAO getRegistaDAOInstance(){
			if(registaDAOInstance == null)
				registaDAOInstance= new RegistaDAOImpl();
			return registaDAOInstance;
		}

}
