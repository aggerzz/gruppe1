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
		kampregpro.setTitle("Velkommen til KampRegPro");

		BorderPane border = new BorderPane();
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		border.setCenter(grid);

		Button opretkamp = new Button("Opret Kamp");
		grid.add(opretkamp, 0, 0);
		opretkamp.setOnAction(e -> {
			OpretKamp intkamp = new OpretKamp();
			intkamp.start(new Stage());
		});

		Button opdaterkamp = new Button("Opdater Kampdata");
		grid.add(opdaterkamp, 0, 1);
		opdaterkamp.setOnAction(e -> {
			OpdaterKamp opdater = new OpdaterKamp();
			opdater.start(new Stage());
		});

		Button kamprapport = new Button("Kamprapport");
		grid.add(kamprapport, 0, 2);
		kamprapport.setOnAction(e -> {
			Kamprapport rapport = new Kamprapport();
			rapport.start(new Stage());
		});

		Button ligaoversigt = new Button("Ligaoversigt");
		grid.add(ligaoversigt, 0, 3);
		ligaoversigt.setOnAction(e -> {
			LigaOversigt liga = new LigaOversigt();
			liga.start(new Stage());
		});

		Button sog = new Button("Søg");
		grid.add(sog, 0, 4);
		sog.setOnAction(e -> {
			Sog soeg = new Sog();
			soeg.start(new Stage());
		});

		Button gkamp = new Button("Luk program");
		grid.add(gkamp, 0, 5);
		gkamp.setOnAction(e -> {
			kampregpro.close();
		});

		Scene scene = new Scene(border, 750, 550);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		kampregpro.setScene(scene);
		kampregpro.show();
	}
}