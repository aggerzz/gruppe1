package presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Kamprapport {
	public void start(Stage kamprapport) {
		kamprapport.setTitle("Kamprapport");

		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER);
		grid.setGridLinesVisible(true);

		Button tilbage = new Button("Tilbage");
		grid.add(tilbage, 0, 0);
		tilbage.setOnAction(e -> {
			kamprapport.close();
		});

		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		kamprapport.setScene(scene);
		kamprapport.show();

	}
}
