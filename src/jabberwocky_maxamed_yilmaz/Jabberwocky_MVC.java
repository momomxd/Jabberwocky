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
		
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte den Text eingeben");
		String inputText = in.nextLine() + "■";
		
		model = new Jabberwocky_Model(5,inputText);
		
		view = new Jabberwocky_View(stage, model);
		controller = new Jabberwocky_Controller(model, view);
		
		view.start();
	}
	
		public static void main(String[] args)  {
		launch();
	}
	


}
