package jabberwocky_maxamed_yilmaz;

public class Jabberwocky_Model {
	
	public static void main(String[] args) {
		
	
		String text ="Für den Aufbau der Statistik verwenden wir ein bewegliches Fenster über die Zeichen des Eingabetexts.";
	
	
	char  char1 = text.charAt(2);
	System.out.println(char1);
	String [] textparts = {};
	
	for (int i = 0; i<text.length()-1; i++) {								//Loop um über den ganzen text zu gehen
	textparts [i] = text.substring(text.charAt(i), text.charAt(i+1));		//Substring methode speichert die Fenstergrösse von 2 in einem String Array

	for(String s : textparts) {												//Ausgabe des Textes
		System.out.println(s);

	}
	

}}}