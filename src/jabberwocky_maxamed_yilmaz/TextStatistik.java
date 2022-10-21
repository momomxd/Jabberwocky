package jabberwocky_maxamed_yilmaz;

import java.util.ArrayList;
import java.util.Random;

public class TextStatistik {
	
	private String inputText;
	private int Fenstergrösse;
	private ArrayList <String>TextTeile;
		
	Character LastChar = '■';
	Character splitChar = 'ⱺ';
	
	public TextStatistik(int Fenstergrösse, String inputText) {
		this.Fenstergrösse = Fenstergrösse;
		this.inputText = inputText;	
		TextTeile = new ArrayList<String>();
	
		GenerateTextTeilListe();
		
	}
	
	/*
	 * Die Methode GenerateTextTeilListe speichert die Fenstergrösse und das nächste Zeichen in Strings
	 * und speichert diese in der ArrayListe "TextTeile"
	 */
	public void GenerateTextTeilListe() {
		boolean endeListe = false;
		int index = 0;
		
		while (!endeListe) {
			
			
			// Holt die Fenstergrösse und speichert es in einem String
		String window = inputText.substring(index, index + Fenstergrösse);	
		
			// Holt das nächste Zeichen und speichert es einem String
		char nextChar =  inputText.charAt(index + Fenstergrösse);
		
		
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
	
	// Methode um nächstes Zeichen zu finden  
	public void findPossibleChar() {
		
		for(int i = 0; i > this.TextTeile.size(); i++) {
			
			String [] TextAndNextChar = new String [TextTeile.size()];
			TextAndNextChar = TextTeile.get(i).split("ⱺ");		
		}		
	}
	
	//Methode um das nächste Zeichen auszuwählen mit Random
	
	public Character getNextChar(String input) {
		
		ArrayList<Character> PossibleNextChar = FindPossibleCharacters(input);
		
		Random randomchar = new Random();
		
		int randomnextchar = randomchar.nextInt(PossibleNextChar.size()-1);
		
		return PossibleNextChar.get(randomnextchar);
	}
	
	
	// Methode gibt eine ArrayListe mit allen möglichen nächsten Zeichen zurück
	public ArrayList <Character> FindPossibleCharacters(String inputText){
	
	ArrayList <Character> possibleCharacters = new ArrayList<>();	
	
	for(int i = 0; i<TextTeile.size();i++) {
		inputText = TextTeile.get(i).toString();
		
		String [] TextandnextChar = inputText.split(Integer.toString(this.splitChar));
		String nextCharinString = TextandnextChar[1];
		String window = TextandnextChar[0];
		char nextChar = nextCharinString.charAt(1);
		
		
		if(inputText.substring(i, i+Fenstergrösse) == window) {
		possibleCharacters.add(TextandnextChar[1].charAt(0));			
			}
		}
	return possibleCharacters;
	
	}
	
	// Methode um einen neuen Text zu generieren
	public String generateText() {
						
	String WindowPart = this.TextTeile.get(0).split(this.splitChar.toString())[0];
		
		boolean endeErreicht = false;
		int index = 0;
		
		while(!endeErreicht) {
			char nextChar = getNextChar(WindowPart.substring(index, index + Fenstergrösse));
			
			WindowPart += nextChar;
			
			if(nextChar == this.LastChar) {
				
				endeErreicht = true;
			}
		}
		return WindowPart;
		
		
	}

	public ArrayList getTextTeile() {
	return TextTeile;
	}

	public void setTextTeile(ArrayList textTeile) {
	TextTeile = textTeile;
	}

	public int getFenstergrösse() {
	return Fenstergrösse;
		}
	}
