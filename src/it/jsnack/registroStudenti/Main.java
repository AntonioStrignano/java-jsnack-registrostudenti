package it.jsnack.registroStudenti;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	RegistroStudenti bept01 = new RegistroStudenti();
	
	System.out.println("Cosa vuoi fare?\n1. Iscrivi un nuovo studente.\n2. Stampa il registro.");
	int menu = input.nextInt();
	input.nextLine();
	
	
	
	while(menu == 1){
		
		
		
		bept01.aggiungiStudente();
		
		
		System.out.println("Cosa vuoi fare?\n1. Iscrivi un nuovo studente.\n2. Stampa il registro.");
		menu = input.nextInt();
		input.nextLine();		
	}
	bept01.stampaRegistro();
		
	}
}

//SONO INCREDIBILE
