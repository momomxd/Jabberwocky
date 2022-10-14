package jabberwocky_maxamed_yilmaz;

import java.util.ArrayList;

public class TextStatistik {
	
	private String inputText;
	private int Fenstergrösse;
	private char LastChar = '■';
	private char splitChar = 'ⱺ';
	private ArrayList TextTeile;
	
	
	
	
	public TextStatistik(int Fenstergrösse, String inputText) {
		this.Fenstergrösse = Fenstergrösse;
		this.inputText = inputText;
		
		TextTeile = new ArrayList<String>();
		
		GenerateTextTeilListe();
		
	}
	boolean endeListe = false;
	
	/*
	 * Die Methode GenerateTextTeilListe speichert die Fenstergrösse und das nächste Zeichen in Strings
	 * und speichert diese in der ArrayListe "TextTeile"
	 */
	public void GenerateTextTeilListe() {
		
		int index = 0;
		
		while (!endeListe) {
			
			// Holt die Fenstergrösse und speichert es in einem String
		String window = inputText.substring(index, index + Fenstergrösse);	
		
			// Holt das nächste Zeichen und speichert es einem String
		char nextChar = inputText.charAt(index + Fenstergrösse);
		
		//Speichert die Fenstergrösse und das nächste Zeichen ab
		TextTeile.add(window  + this.splitChar  + nextChar);
		
		index++;
		
		// If schleife kontrolliert ob wir das letzte Zeichen '■' erreicht wurde
		 if(nextChar == this.LastChar) {
		 	endeListe = true;
		 }
			 
		}
		
	}
	
	// Methode um Liste zu überprüfen
	public void showList() {
		
		for(int i = 0; i < TextTeile.size(); i++)
			System.out.println(TextTeile.get(i));
	
	}
	
	

}

