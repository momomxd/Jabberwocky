package jabberwocky_maxamed_yilmaz;

import javafx.scene.Scene;
import javafx.scene.control.Button;
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
	protected Slider slider;
	protected MenuBar menuBar;
	protected Menu menuFile, menuHelp;
					
	public Jabberwocky_View(Stage primaryStage, Jabberwocky_Model model) { 
		
			this.Model = model;
			this.stage = primaryStage;
		
			
			BorderPane pane = new BorderPane();
			HBox box = new HBox();
			
		stage.setTitle(" JabberWocky - Sprachlernmaschine");
		
		menuBar = new MenuBar();
		menuFile = new Menu("File");
		menuHelp = new Menu("Help");
		
		menuBar.getMenus().addAll(menuFile,menuHelp);
		
		btnGenerate = new Button("Generate");
		
		slider = new Slider();
		
		box.getChildren().add(slider);
		
		txtArea = new TextArea();
		
		pane.setTop(menuBar);
		pane.setRight(btnGenerate);
		pane.setBottom(txtArea);
		pane.setCenter(box);
		
		Scene scene = new Scene(pane);
		
		stage.setScene(scene);
	
		
	}
	public void start() {
		stage.show();
	}
	
}
