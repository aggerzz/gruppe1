package presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Sog {
	public void start(Stage kampregpro) {
		kampregpro.setTitle("SØG");
		
		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setGridLinesVisible(true);
		
		Label lsog = new Label("Søg på noget: ");
		grid.add(lsog, 0, 0);
		TextField tsog = new TextField();
		grid.add(tsog, 1, 0);
		
		Button ligaoversigt = new Button("Søg");
		grid.add(ligaoversigt, 0, 2);
		ligaoversigt.setOnAction(e -> {
		});
		
		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		kampregpro.setScene(scene);
		kampregpro.show();
	}
}