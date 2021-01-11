package it.solving.gestioneRegistaJPA.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "regista")
public class Regista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@Column(name = "numerooscarvinti")
	private int numeroOscarVinti;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "regista")
	private Set<Film> filmografia = new HashSet<>();

	public Regista() {

	}

	public Regista(String nome, String cognome, int numeroOscarVinti) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.numeroOscarVinti = numeroOscarVinti;
	}

//	public Regista(Long id, String nome, String cognome, int numeroOscarVinti) {
//		this.id = id;
//		this.nome = nome;
//		this.cognome = cognome;
//		this.numeroOscarVinti = numeroOscarVinti;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumeroOScarVinti() {
		return numeroOscarVinti;
	}

	public void setNumeroOscarVinti(int numeroOscarVinti) {
		this.numeroOscarVinti = numeroOscarVinti;
	}

	public Set<Film> getFilmografia() {
		return filmografia;
	}

	public void setFilmografia(Set<Film> filmografia) {
		this.filmografia = filmografia;
	}

	public String toString() {
		return "Regista [nome=" + nome + ", cognome=" + cognome + ", numero oscar vinti=" + numeroOscarVinti + "]";
	}

}
