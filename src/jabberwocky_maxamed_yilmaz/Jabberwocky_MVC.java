package jabberwocky_maxamed_yilmaz;

import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;

public class Jabberwocky_MVC extends Application{
	
	private Jabberwocky_Model model;
	private Jabberwocky_View view;
	private Jabberwocky_Controller controller;

	
		
		
	@Override
	public void start(Stage stage) throws Exception {
		
	
		

		model = new Jabberwocky_Model();
		
		view = new Jabberwocky_View(stage, model);
		controller = new Jabberwocky_Controller(model, view);
		
		view.start();
	}
	
		public static void main(String[] args)  {
		launch();
	}
	


}
