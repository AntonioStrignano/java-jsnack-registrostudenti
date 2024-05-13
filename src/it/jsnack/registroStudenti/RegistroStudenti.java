package it.jsnack.registroStudenti;

import java.util.Scanner;

public class RegistroStudenti {	
	private Studente[] sezione;
	private int slots;
	private int alunniNum;
	
	public RegistroStudenti() {
		this.slots = 3;
		this.sezione = new Studente[this.slots];
	}
	
	Scanner input = new Scanner(System.in);

	
	public void aggiungiStudente() {
		if(alunniNum == slots) {
			System.out.println("Il registro è pieno.");
		}
		else {
			

			String nomeStud;
			String cognStud;
			int anniStud;
			System.out.println("Nome studente: ");
			nomeStud = input.nextLine();
			System.out.println("Cognome studente: ");
			cognStud = input.nextLine();
			System.out.println("Anni studente:");
			anniStud = input.nextInt();
			input.nextLine();
			
			Studente newStud = new Studente(nomeStud, cognStud, anniStud);
			
		this.sezione[this.alunniNum] = newStud;
		this.alunniNum ++;
		System.out.println("Hai aggiunto lo studente: " + newStud.getNome() + " " + newStud.getCognome() + " di anni " + newStud.getAnni() + " al registro");
		}
	}
	
	public void stampaRegistro() {

		System.out.println("Ecco gli alunni presenti nel registro della sezione BEPT01: ");
		for (int i = 0; i < this.alunniNum; i++) {
			System.out.println(sezione[i].getNome() + " " + sezione[i].getCognome() + ", anni "
			+ sezione[i].getAnni());
	}
	}
	
	// GETTER E SETTER
	public int getSlots() {
		return slots;
	}

	public void setSlots(int slots) {
		this.slots = slots;
	}

	public Studente[] getSezione() {
		return sezione;
	}

	public void setSezione(Studente[] sezione) {
		this.sezione = sezione;
	}

	public int getAlunniNum() {
		return alunniNum;
	}

	public void setAlunniNum(int alunniNum) {
		this.alunniNum = alunniNum;
	}
	// / GETTER E SETTER
	
	
}
