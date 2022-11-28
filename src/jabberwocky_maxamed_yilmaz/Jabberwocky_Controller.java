package jabberwocky_maxamed_yilmaz;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.*;
import javafx.stage.*;

public class Jabberwocky_Controller {

	Jabberwocky_Model model;
	Jabberwocky_View view;

	public Jabberwocky_Controller(Jabberwocky_Model model, Jabberwocky_View view) {

		this.model = model;
		this.view = view;

		// Changelistener für die Fenstergrösse

		view.slider.valueProperty().addListener(
			(observable, oldvalue, newvalue) -> {
			model.setFensterGrösse(newvalue.intValue());
		});

		// TODO ChangeListener für den Eingabetext

		// TODO EVENTHANDLING FÜR DAS EINLESEN EINER TEXTDATEI

		// EVENTHANDLING FÜR DEN GENERATE BUTTON
		view.btnGenerate.setOnAction((event) -> {

			model.setInputText(view.txtArea.getText());

			model.setTextTeile();

			String newText = model.generateText();

			view.newTxt.setText(newText);
		});

	}

}
