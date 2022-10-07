package jabberwocky_maxamed_yilmaz;

import javafx.application.Application;
import javafx.stage.Stage;

public class Jabberwocky_MVC extends Application{
	
	private Jabberwocky_Model model;
	private Jabberwocky_View view;

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		model = new Jabberwocky_Model();
		view = new Jabberwocky_View(primaryStage, model);
		view.start();
	}
	
	
	public static void main(String[] args)  {
		launch();
	}

}
