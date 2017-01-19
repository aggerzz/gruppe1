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
	public void start(Stage sog) {
		sog.setTitle("SØG");
		
		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER);
		grid.setGridLinesVisible(true);
		
		Label lsog = new Label("Søg på noget: ");
		grid.add(lsog, 0, 0);
		TextField tsog = new TextField();
		grid.add(tsog, 1, 0);
		
		Button ligaoversigt = new Button("Søg");
		grid.add(ligaoversigt, 1, 2);
		ligaoversigt.setOnAction(e -> {
		});
		
		Button tilbage = new Button("Tilbage");
		grid.add(tilbage, 0, 2);
		tilbage.setOnAction(e -> {
			sog.close();
		});
		
		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		sog.setScene(scene);
		sog.show();
	}
}