package jabberwocky_maxamed_yilmaz;

import java.util.ArrayList;

public class TextStatistik {
	
	private String inputText;
	private int Fenstergrösse;
	private char LastChar = '■';
	private char splitChar = '¥';
	private ArrayList TextTeile;
	
	
	
	public TextStatistik(int Fenstergrösse, String inputText) {
		this.Fenstergrösse = Fenstergrösse;
		this.inputText = inputText;
		
		TextTeile = new ArrayList<String>();
		
		GenerateWahrscheinlichkeitsListe();
		
	}
	boolean endeListe = false;
	
	public void GenerateWahrscheinlichkeitsListe() {
		
		int index = 0;
		
		while (!endeListe) {
			
			// Holt die Fenstergrösse
		String window = inputText.substring(index, index + Fenstergrösse);	
		
			// Holt das nächste Zeichen
		char nextChar = inputText.charAt(index + Fenstergrösse);
		
		//Speichert die Fenstergrösse und das nächste Zeichen ab
		TextTeile.add(window + " ¥ " + nextChar);
		
		index++;
		
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

