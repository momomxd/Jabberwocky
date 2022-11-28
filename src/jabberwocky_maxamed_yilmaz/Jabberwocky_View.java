package jabberwocky_maxamed_yilmaz;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Jabberwocky_View {

	private Jabberwocky_Model Model;
	protected Stage stage;
	protected Button btnGenerate;						// Button um neuen text zu generieren
	protected TextArea txtArea;	 ////Textfeld für Eingabe
	protected TextArea newTxt;	//Textfeld für Ausgabe
	protected Label ausgabe;	// Label für ausgabe
	protected Label	eingabe;	// Label für eingabe
	protected Slider slider;
	protected Button file;	// Button um Datei einzulesen
	protected Menu menuFile, menuHelp;
					
	public Jabberwocky_View(Stage stage, Jabberwocky_Model model) { 
		
			this.Model = model;
			this.stage = stage;
		
			stage.setTitle(" JabberWocky - Sprachlernmaschine");
			
			BorderPane pane = new BorderPane();
			BorderPane boxforbuttons = new BorderPane();
			
			VBox topBox = new VBox();
			GridPane GPText = new GridPane();
			
			file = new Button("  File  ");
		
		btnGenerate = new Button("Generate");
		
		slider = new Slider();
		slider.setValue(4);
		slider.setMin(1);
		slider.setMax(7);
		slider.setMajorTickUnit(1);
		slider.setMinorTickCount(0);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setSnapToTicks(true);
		
		boxforbuttons.setRight(btnGenerate);
		boxforbuttons.setLeft(slider);
		
		eingabe = new Label ("Eingabe: ");
		txtArea = new TextArea(model.inputText); 
		
		newTxt = new TextArea();
		ausgabe = new Label ("Ausgabe: ");
		
	
		GPText.add(eingabe, 0, 0);
		GPText.add(txtArea, 0, 1);
		GPText.add(ausgabe, 1, 0);
		GPText.add(newTxt, 1, 1);
			
			topBox.getChildren().add(file);
			topBox.getChildren().add(boxforbuttons);
			topBox.getChildren().add(GPText);
			
		pane.setTop(topBox);
		pane.setCenter(GPText);
		
		Scene scene = new Scene(pane);
		
		stage.setScene(scene);
	
	
	
	
	
	}	public void start() {
		stage.show();
	}
	
	public Stage getStage() {
		return stage;
	}
	
	
}
