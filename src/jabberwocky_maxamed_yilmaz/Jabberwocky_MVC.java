package jabberwocky_maxamed_yilmaz;

import javafx.application.Application;
import javafx.stage.Stage;

public class Jabberwocky_MVC extends Application{
	
	private Jabberwocky_Model model;
	private Jabberwocky_View view;
	private Jabberwocky_Controller controller;

		public static void main(String[] args)  {
		launch();
	}
	@Override
	public void start(Stage stage) throws Exception {
		model = new Jabberwocky_Model(3,"hallo mein Name ist Mohamed");
		view = new Jabberwocky_View(stage, model);
		controller = new Jabberwocky_Controller(model, view);
		view.start();
	}
	
	


}
