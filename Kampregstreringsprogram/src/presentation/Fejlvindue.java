package presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
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
	grid.setGridLinesVisible(true);
	
	Label fejl1 = new Label("Der opstod en fejl. vær sikker på at du har udfyldt");
	grid.add(fejl1, 0, 1);
	Label fejl2 = new Label( "alle felter korrekt og prøv igen");
	grid.add(fejl2, 0, 2);
	
	Scene scene = new Scene(border, 600, 150);
	scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
	fejlvindue.setScene(scene);
	fejlvindue.show();
}
}
	
