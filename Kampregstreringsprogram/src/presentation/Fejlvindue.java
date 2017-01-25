package presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fejlvindue {
	public void start(Stage fejlvindue) {
	fejlvindue.setTitle("Fejl");
	
	// Border
	BorderPane border = new BorderPane();
	// Grid
	GridPane grid = new GridPane();
	border.setCenter(grid);
	grid.setAlignment(Pos.CENTER);
	grid.setGridLinesVisible(false);
	
	Label lhjemmehold = new Label("Der opstod en fejl. \nVær sikker på at du har udfyldt \nalle felter korrekt og prøv igen");
	grid.add(lhjemmehold, 0,0 );
	
	Button tilbage = new Button("Tilbage");
	grid.add(tilbage, 0,1);
	tilbage.setOnAction(e -> {
		fejlvindue.close();
	});
	
	Scene scene = new Scene(border, 650, 450);
	scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
	fejlvindue.setScene(scene);
	fejlvindue.show();
}
}
	
