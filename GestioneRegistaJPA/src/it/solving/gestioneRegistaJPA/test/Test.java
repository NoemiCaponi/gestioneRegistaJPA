package it.solving.gestioneRegistaJPA.test;

import java.util.ArrayList;
import java.util.List;

import it.solving.gestioneRegistaJPA.dao.EntityManagerUtil;
import it.solving.gestioneRegistaJPA.model.Film;
import it.solving.gestioneRegistaJPA.model.Regista;
import it.solving.gestioneRegistaJPA.service.MyServiceFactory;
import it.solving.gestioneRegistaJPA.service.film.FilmService;
import it.solving.gestioneRegistaJPA.service.regista.RegistaService;

public class Test {

	public static void main(String[] args) {
		RegistaService registaService = MyServiceFactory.getRegistaServiceInstance();
		FilmService filmService = MyServiceFactory.getFilmServiceInstance();

		try {

//			Regista nuovoRegista=new Regista("Ridley", "Scott",2);
//			registaService.inserisciNuovo(nuovoRegista);
//			System.out.println("Regista appena inserito: "+ nuovoRegista);
//			
//			Film nuovoFilm=new Film("Mondo dei replicanti", "Fantascienza", 180);
//			nuovoFilm.setRegista(nuovoRegista);
//			filmService.inserisciNuovo(nuovoFilm);
//			
//			Regista registaInstance=registaService.caricaSingoloRegistaoConFilm(nuovoRegista.getId());
//			System.out.println("Nuovo inserimento: " + registaInstance.getFilmografia());
//
//			
//			Film filmProva=filmService.caricaSingoloFilm(2L);
//			if(filmProva!=null) {
//				filmService.rimuovi(filmProva);
//				filmProva=filmService.caricaSingoloFilm(2L);
//				if(filmProva==null)
//					System.out.println("Cancellato");
//				else
//					System.out.println("Non cancellato");
//			}

//			for(Regista registaItem:registaService.listAllRegisti()) {
//				System.out.println(registaItem);
//			}

//			Film filmEsistente=filmService.caricaSingoloFilm(2L);
//			if(filmEsistente!=null) {
//				filmService.rimuovi(filmEsistente);
//				filmEsistente=filmService.caricaSingoloFilm(2L);
//				if(filmEsistente==null)
//					System.out.println("cancellazione riuscita");
//				else
//					System.out.println("Cancellazione non riuscita");
//			}

//			Regista registaEsistente=registaService.caricaSingoloRegista(4L);
//			if(registaEsistente!=null) {
//				registaService.rimuovi(registaEsistente);
//				registaEsistente=registaService.caricaSingoloRegista(4L);
//				if(registaEsistente==null)
//					System.out.println("cancellazione riuscita");
//				else
//					System.out.println("Cancellazione non riuscita");
//			}

//			for(Film filmItem:filmService.cercaPerTitolo("Mondo dei replicanti")) {
//				System.out.println(filmItem);
//			}
//			
//			for(Regista registaItem:registaService.trovaMaggiorNumeroOSccar()) {
//				System.out.println(registaItem);
//			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			EntityManagerUtil.shutdown();
		}

	}

}
