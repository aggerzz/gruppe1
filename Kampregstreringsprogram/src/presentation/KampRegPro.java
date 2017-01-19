package presentation;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KampRegPro extends Application {

	@Override
	public void start(Stage startint) {
		startint.setTitle("Velkommen");

		BorderPane border = new BorderPane();
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.BASELINE_CENTER);
		border.setCenter(grid);

		Button ligaoversigt = new Button("Ligaoversigt");
		grid.add(ligaoversigt, 0, 0);
		ligaoversigt.setOnAction(e -> {
			OpretKamp intkamp = new OpretKamp();
			intkamp.start(new Stage());
		});
		
		Button kamprapport = new Button("Kamprapport");
		grid.add(kamprapport, 0, 1);
		kamprapport.setOnAction(e -> {
			OpretKamp intkamp = new OpretKamp();
			intkamp.start(new Stage());
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
			OpretKamp intkamp = new OpretKamp();
			intkamp.start(new Stage());
		});
		
		Scene scene = new Scene(border);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		startint.setScene(scene);
		startint.show();
	}
	
}