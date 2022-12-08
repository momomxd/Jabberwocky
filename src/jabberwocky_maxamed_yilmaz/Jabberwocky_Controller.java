package jabberwocky_maxamed_yilmaz;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.FileNotFoundException;

import javafx.application.*;
import javafx.stage.*;



	public class Jabberwocky_Controller {

		Jabberwocky_Model model;
		Jabberwocky_View view;
		long ListTime;
		public Jabberwocky_Controller(Jabberwocky_Model model, Jabberwocky_View view) {

			this.model = model;
			this.view = view;

			// Changelistener für die Fenstergrösse

			view.slider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
				model.setFensterGrösse(newvalue.intValue());
			});

			// ChangeListener für den Eingabetext

			view.txtArea.textProperty().addListener((observable, oldValue, newValue) -> {
				view.btnGenerate.setDisable(newValue.isEmpty());
			});

			// EVENTHANDLING FÜR DAS EINLESEN EINER TEXTDATEI
			view.file.setOnAction((event) -> {

				try {

					String text = addEndCharIfNotPresent(model.FiletoString(), model.LastChar);

					model.setInputText(text);
					model.setFensterGrösse((int) view.slider.getValue());

					view.txtArea.setText(model.inputText);

				} catch (FileNotFoundException e) {
					view.txtArea.setText("Datei wurde nicht gefunden");
				}

			});

			// EVENTHANDLING FÜR DEN GENERATE BUTTON
			view.btnGenerate.setOnAction((event) -> {
				
				//Try-Catch falls die Eingabe zu kurz ist
			
				try{
				long start = System.currentTimeMillis(); 			// Startpunkt für Berechnung
				
				model.setInputText(view.txtArea.getText() + model.LastChar);
				model.setTextTeile();

				String newText = model.generateText();
				view.newTxt.setText(newText);
				
				
				long end = System.currentTimeMillis(); 				// Endpunkt für Zeitberechnung
				long total = end - start;
				System.out.println("Berechnungszeit: " + total + " Millisekunden");
				
				//Abfangen falls Fenstergrösse grösser als die Eingabe ist
			} catch (StringIndexOutOfBoundsException e) {	
				String newText = "Die Eingabe ist zu kurz!" + '\n' +"gib bitte einen längeren Text ein";
			
			
				view.newTxt.setText(newText);
			
			
				}
			});
		}
		
				// Methode fügt dem eingelesenen Text das definierte Schlusszeichen ein
		private String addEndCharIfNotPresent(String string, Character lastchar) {
			if (string.endsWith(lastchar.toString())) {
				return string;
			}
			return string + lastchar;
		}
	}