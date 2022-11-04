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
	protected TextArea txtArea;							////Textfeld für Eingabe
	protected Label	txtLabel;
	protected Slider slider;
	protected MenuBar menuBar;
	protected Menu menuFile, menuHelp;
					
	public Jabberwocky_View(Stage stage, Jabberwocky_Model model) { 
		
			this.Model = model;
			this.stage = stage;
		
			stage.setTitle(" JabberWocky - Sprachlernmaschine");
			
			BorderPane pane = new BorderPane();
			HBox boxforbuttons = new HBox();
			HBox boxfortxt = new HBox();
			VBox topBox = new VBox();
			
		
		menuBar = new MenuBar();
		menuFile = new Menu("File");
		menuHelp = new Menu("Help");
		
		menuBar.getMenus().addAll(menuFile,menuHelp);
		
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
		
		boxforbuttons.getChildren().add(slider);
		boxforbuttons.getChildren().add(btnGenerate);
		
		txtArea = new TextArea();
		txtLabel = new Label("Ausgabe: "); 
		boxfortxt.getChildren().add(txtArea);
		boxfortxt.getChildren().add(txtLabel);
		
	
			
			topBox.getChildren().add(menuBar);
			topBox.getChildren().add(boxforbuttons);
			
		pane.setTop(topBox);
		pane.setCenter(boxfortxt);
		
		Scene scene = new Scene(pane);
		
		stage.setScene(scene);
	
	
	
	
	
	}	public void start() {
		stage.show();
	}
	
	public Stage getStage() {
		return stage;
	}
	
	
}
