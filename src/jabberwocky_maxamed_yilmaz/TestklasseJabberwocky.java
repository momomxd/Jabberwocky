package jabberwocky_maxamed_yilmaz;

import java.util.ArrayList;

public class TestklasseJabberwocky {

	public static void main(String[] args) {
		
	
	TextStatistik textStatistik = new TextStatistik(2,"Hallo mein Name ist Mohamed ■");
	
	textStatistik.GenerateTextTeilListe();
	
	textStatistik.showList();
	
	textStatistik.generateText();
	
	
	
	
//ArrayList <Character> possibleCharacters = new ArrayList<>();	
//	
//	for(int i = 0; i<textStatistik.getTextTeile().size();i++) {
//	
//	String text = textStatistik.getTextTeile().get(i).toString();
//		
//		String [] TextandnextChar = text.split("ⱺ");
//		
//		String nextCharinString = TextandnextChar[1];
//		String window = TextandnextChar[0];
//		char nextChar = nextCharinString.charAt(0);
//		
//		
//		
//		possibleCharacters.add(nextChar);
//				
//		
//	}
//	System.out.println(possibleCharacters);
//ArrayList <String> windowList = new ArrayList<>();	
//	
//	for(int i = 0; i<textStatistik.getTextTeile().size();i++) {
//	
//	String text = textStatistik.getTextTeile().get(i).toString();
//		
//		String [] TextandnextChar = text.split("ⱺ");
//		
//		String nextCharinString = TextandnextChar[1];
//		String window = TextandnextChar[0];
//		char nextChar = nextCharinString.charAt(0);
//	
//		windowList.add(window);
//
//	
//	
//	
//	
//	}	System.out.println(windowList);
//	

	}}


