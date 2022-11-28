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

		// Changelister für Slider
		
		view.slider.valueProperty().addListener(
				(observable,oldvalue,newvalue) -> {
					model.setFensterGrösse(newvalue.intValue());
				});
		
		view.btnGenerate.setOnAction((event) -> {
			model.generateText();
		});
		
		
	}

}
