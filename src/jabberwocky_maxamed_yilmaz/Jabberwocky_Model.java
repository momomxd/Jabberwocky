package jabberwocky_maxamed_yilmaz;

public class Jabberwocky_Model {
	
	public static void main(String[] args) {
		
		
				// Speichert die Zeichen von einer Fenstergrösse von 2 in einem String Array und
				// verschiebt sich um 1 zeichen
		
		String text ="Heute ist ein wunderschöner Tag";				// provisorischer text
		String[] textparts = new String[text.length()];				// String Array um Zeichen zu speichern
			
				for (int count = 0; count < text.length() - 1; count++) {
					// Loop um über den ganzen text zu gehen
					textparts[count] = text.charAt(count) + "" + text.charAt(count + 1); 	// Speichert Zeichen in Array

					System.out.println(textparts[count]);									// gibt die Zeichen aus

	}
	

}}