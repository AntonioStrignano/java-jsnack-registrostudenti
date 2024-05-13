package it.jsnack.registroStudenti;

public class Studente {
	private String nome;
	private String cognome;
	private int anni;
	
	public Studente(String nome, String cognome, int anni) {
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
	}

	//GETTER E SETTER
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

	public String getAnni() {
		return Integer.toString(anni);
	}

	public void setAnni(int anni) {
		this.anni = anni;
	}
	// /GETTE
	

}
