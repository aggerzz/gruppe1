package presentation;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import presentation.LigaOversigt;
import presentation.OpretKamp;
import presentation.Sog;

public class KampRegPro extends Application {

	public void start(Stage kampregpro) {
		kampregpro.setTitle("Velkommen");
		
		BorderPane border = new BorderPane();
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.BASELINE_CENTER);
		border.setCenter(grid);

		Button ligaoversigt = new Button("Ligaoversigt");
		grid.add(ligaoversigt, 0, 0);
		ligaoversigt.setOnAction(e -> {
			LigaOversigt liga = new LigaOversigt();
			liga.start(new Stage());
		});
		
		Button kamprapport = new Button("Kamprapport");
		grid.add(kamprapport, 0, 1);
		kamprapport.setOnAction(e -> {
		});
		
		
		Button opretkamp = new Button("Opret Kamp");
		grid.add(opretkamp, 0, 2);
		opretkamp.setOnAction(e -> {
			OpretKamp intkamp = new OpretKamp();
			intkamp.start(new Stage());
		});
		
		Button sog = new Button("Søg");
		grid.add(sog, 0, 3);
		sog.setOnAction(e -> {
			Sog soeg = new Sog();
			soeg.start(new Stage());
		});
		
		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		kampregpro.setScene(scene);
		kampregpro.show();
	}
}