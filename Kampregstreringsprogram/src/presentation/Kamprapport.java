package presentation;

	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;
public class Kamprapport {	
		public void start(Stage kamprapport) {
			kamprapport.setTitle("Kamp");
			
			// Border
			BorderPane border = new BorderPane();
			// Grid
			GridPane grid = new GridPane();
			border.setCenter(grid);
			grid.setAlignment(Pos.CENTER);
			grid.setGridLinesVisible(true);
			
			Scene scene = new Scene(border, 700, 500);
			scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
			kamprapport.setScene(scene);
			kamprapport.show();

		}
	}


