package jabberwocky_maxamed_yilmaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javafx.stage.FileChooser;

public class Jabberwocky_Model {
	
	Character LastChar = '■';
	Character splitChar = 'ⱺ';
	
	
	String inputText;
	private int Fenstergrösse;
	
	//private List <String>TextTeile;
	
	/*
	 * Wir ersetzen die Liste mit einer HashMap
	 * Der Key wird die Fenstergrösse zum matchen und der Value eine Liste mit den nächsten Zeichen
	 */
	private HashMap<String, List<Character>> TextTeile;
	
	
	public Jabberwocky_Model() {
		
	//	TextTeile = new ArrayList<String>();
		TextTeile = new HashMap<>();
	}
//		public List<String> getTextTeile(){
//			return this.TextTeile;
//	 }
	
	public HashMap<String, List<Character>> getTextTeile(){
		return TextTeile;
	}
	
	public void setInputText(String input) {
		this.inputText = input;
		
	}
	
	public void setFensterGrösse(int value) {
		this.Fenstergrösse = value;
	}
	public void setTextTeile() {
		
		// Die Liste muss geleert werden bevor neue Textteile hinzugefügt werden können
		TextTeile.clear();
		GenerateTextTeile();
	}
	
	
	/*
	 * Die Methode GenerateTextTeilListe speichert die Fenstergrösse und das nächste Zeichen in Strings
	 * und speichert diese in der ArrayListe "TextTeile" im Format: StartString {splitChar} NextChar
	 */
	private void GenerateTextTeile() {
		boolean endeErreicht = false;
		int index = 0;
		
		while (!endeErreicht) {
			
				// Holt die Fenstergrösse und speichert es in einem String
			String window = inputText.substring(index, index + Fenstergrösse);	
		
				// Holt das nächste Zeichen nach der Fenstergrösse
			Character nextChar =  inputText.charAt(index + Fenstergrösse);
		
				// fügt den StartString + splitchar + nextChar der TextTeile Liste hinzu
		//	this.TextTeile.add(window  + this.splitChar  + nextChar);
		//	index++;
			
		
				//Wenn das nächste Zeichen und das letzte Zeichen gleich sind, hat man das Ende des Input Textes erreicht
			if(nextChar.equals(this.LastChar)) {
		 	endeErreicht = true;
			}	 
		}	
		
		// nachdem die Liste mit Werten gefüllt wurde, sortieren wir sie für die binäre Suche
		/*
		 * Sortieren ist bei einer HashMap nicht notwendig
		 */
	//	Collections.sort(TextTeile);
		
	}
	
	// Methode um Liste zu überprüfen -> nicht für das Programm relevant 
	public void showList() {
		
		for(int i = 0; i < TextTeile.size(); i++)
			System.out.println(TextTeile.get(i));
	
	}
	
	//Methode um das nächste Zeichen auszuwählen mit Random
	
	public Character getNextChar(String input) {
		
		//holt alle möglichen nächsten Zeichen
		List<Character> PossibleNextChar = findPossibleCharacters(input);
		
		Random randomchar = new Random();
		
		int randomnextchar = randomchar.nextInt(PossibleNextChar.size());
		
		return PossibleNextChar.get(randomnextchar);
	}
	
	
	// Methode gibt eine ArrayListe mit allen möglichen nächsten Zeichen zurück
	private List <Character> findPossibleCharacters(String input){
	
		List <Character> possibleCharacters = new ArrayList<>();	
	
		// Schleife durch jeden String der Liste "TextTeile"
		for(int i = 0; i<TextTeile.size();i++) {
		
			String [] TextandnextChar =this.TextTeile.get(i).split(this.splitChar.toString());
			
		// Wenn der Text gleich ist wie der input
		if(TextandnextChar[0].equals(input)) {
			// füge das dazugehörige nächste Zeichen dem Array hinzu
		possibleCharacters.add(TextandnextChar[1].charAt(0));			
			}
		}
		
	return possibleCharacters;
	
	}
	
	
	// Methode um einen neuen Text zu generieren
	public String generateText() {
						
	String newText = this.TextTeile.get(0).split(this.splitChar.toString())[0];
		
		boolean endeErreicht = false;
		int index = 0;
		
		while(!endeErreicht) {
			char nextChar = getNextChar(newText.substring(index, index + Fenstergrösse));
			
			newText += nextChar;
			
			
			if(nextChar == this.LastChar) {
				endeErreicht = true;
			}
		index++;	
		}
		System.out.print(newText);	
		return newText;
		
	}
	
	// Methode liest eine Textdatei ein und gibt den Inhalt als String zurück
	
    public String FiletoString () throws FileNotFoundException {
    	
    	String text = "";
    			FileChooser fileChooser = new FileChooser();
    		File file =	fileChooser.showOpenDialog(null);
    			
    			try {
    			Scanner scan = new Scanner(file);
    			while(scan.hasNextLine()) {
    				text += scan.nextLine();
    			}
    			scan.close();
    			
    			
    			} catch (IOException e) {
    			e.printStackTrace();
    			}return text;
    }
	
}
