package jabberwocky_maxamed_yilmaz;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.FileNotFoundException;

import javafx.application.*;
import javafx.stage.*;

public class Jabberwocky_Controller {

	Jabberwocky_Model model;
	Jabberwocky_View view;

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		// EVENTHANDLING FÜR DEN GENERATE BUTTON
		view.btnGenerate.setOnAction((event) -> {

			model.setInputText(view.txtArea.getText() + model.LastChar);

			model.setTextTeile();

			String newText = model.generateText();

			view.newTxt.setText(newText);
		});
	}

	private String addEndCharIfNotPresent(String string, Character lastchar) {
		if (string.endsWith(lastchar.toString())) {
			return string;
		}
		return string + lastchar;
	}

}