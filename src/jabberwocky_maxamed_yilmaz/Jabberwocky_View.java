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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Jabberwocky_View {

	private Jabberwocky_Model Model;
	protected Stage stage;
	protected Button btnGenerate;						// Button um neuen text zu generieren
	protected TextArea txtArea;	 						//Textfeld für Eingabe
	protected TextArea newTxt;							//Textfeld für Ausgabe
	protected Label ausgabe;							// Label für ausgabe
	protected Label	eingabe;							// Label für eingabe
	protected Slider slider;							// Slider um die Fenstergrösse anzupassen
	protected Button file;								// Button um Datei einzulesen
					
	public Jabberwocky_View(Stage stage, Jabberwocky_Model model) { 
		
			this.Model = model;
			this.stage = stage;
		
			stage.setTitle(" Jabberwocky - Sprachlernmaschine");
			
			BorderPane pane = new BorderPane();
			pane.setId("pane-background");
			
			
			VBox topBox = new VBox();				
			GridPane GPText = new GridPane();
			
			file = new Button();
			file.setMaxSize(80, 100);
			file.setText("Datei");
			file.setId("file");
		
		btnGenerate = new Button("Generieren");
		btnGenerate.setId("generate");
		btnGenerate.getStyleClass().add("fancy-button");
		btnGenerate.setDisable(true);
		
		//Slider wird für die Änderung der Fenstergrösse benötigt
		slider = new Slider();
		slider.setEffect(null);
		slider.setValue(4);
		slider.setMin(1);
		slider.setMax(7);
		slider.setMajorTickUnit(1);
		slider.setMinorTickCount(0);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setSnapToTicks(true);
	
		// für den Slider und den generate button
		HBox boxforbuttons = new HBox(550,slider, btnGenerate);	
		
		
		
		eingabe = new Label ("Eingabe: ");
		eingabe.setTextFill(Color.WHITE);
		eingabe.setMinWidth(50);
		eingabe.setMinHeight(50);
		eingabe.setFont(new Font("Cambria", 30));

		
		ausgabe = new Label ("Ausgabe: ");
		ausgabe.setTextFill(Color.WHITE);
		ausgabe.setMinWidth(50);
		ausgabe.setMinHeight(50);
		ausgabe.setFont(new Font("Cambria", 30));
		
		
		txtArea = new TextArea(); 		// für die Eingabe	
		newTxt = new TextArea();		// für die Ausgabe
	
	
		GPText.add(eingabe, 0, 0);
		GPText.add(txtArea, 0, 1);
		GPText.add(ausgabe, 1, 0);
		GPText.add(newTxt, 1, 1);
			
			topBox.getChildren().add(file);
			topBox.getChildren().add(boxforbuttons);
			topBox.getChildren().add(GPText);
			
		pane.setTop(topBox);
		pane.setCenter(GPText);
		
		Scene scene = new Scene(pane,800,500);
		
		scene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
		 scene.getStylesheets().add(String.valueOf(this.getClass().getResource("Background.css")));
		stage.show();
		stage.setScene(scene);
	
	
	
	
	
	}	public void start() {
		stage.show();
	}
	
	public Stage getStage() {
		return stage;
	}
	
	
}
