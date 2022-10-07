package jabberwocky_maxamed_yilmaz;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Jabberwocky_View {

	private Jabberwocky_Model Model;
	private Stage stage;
	
	protected TextField textfield;						//Textfeld für Eingabe
	protected HBox HboxforControls;
	protected VBox vboxforControls;						//Hbox für Kontroll elemente
	protected Button btn;								//Button für eingabe bestätigen
	
	public Jabberwocky_View(Jabberwocky_Model model, Jabberwocky_View view) {
		
		this.Model = model;
		this.stage = stage;
		
		stage.setTitle(" JabberWocky - Sprachlernmaschine");
		textfield = new TextField();
		
		btn = new Button("generate Text");
		
		HBox HBoxforControls = new HBox(btn);
		
		VBox root = new VBox(HBoxforControls,textfield);
	
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
	
		
	}
	public void start() {
		stage.show();
	}
	
}
