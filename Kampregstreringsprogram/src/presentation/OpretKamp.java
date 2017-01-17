package src.presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OpretKamp {

	public void start (Stage opretkamp){
		opretkamp.setTitle("Kamp");
		
		//Border
		BorderPane border = new BorderPane();
		//Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setGridLinesVisible(true);
		
		//Dato
		Label ldato = new Label("Dato: ");
		grid.add(ldato, 0, 0);
		TextField tdato = new TextField();
		grid.add(tdato, 1, 0);
		
		//Tid
		Label ltid = new Label("Tid: ");
		grid.add(ltid, 0, 1);
		TextField ttid = new TextField();
		grid.add(ttid, 1, 1);
		
		//Sted
		Label lsted = new Label("Sted: ");
		grid.add(lsted, 0, 2);
		TextField tsted = new TextField();
		grid.add(tsted, 1, 2);
		
		//Hjemmeholdet
		Label lhjemmehold = new Label("Hjemmehold: ");
		grid.add(lhjemmehold, 0, 3);
		TextField thjemmehold = new TextField();
		grid.add(thjemmehold, 1, 3);
		
		//Udeholdet
		Label ludehold = new Label("UdeHold: ");
		grid.add(ludehold, 0, 4);
		TextField tudehold = new TextField();
		grid.add(tudehold, 1, 4);
		
		
		Button opretenkamp = new Button("OK");
		grid.add(opretenkamp, 1, 5);
		opretenkamp.setOnAction(e -> {
		});
		Button fortryd = new Button("Fortryd");
		grid.add(fortryd, 0, 5);
		fortryd.setOnAction(e -> {
		});

		Scene scene = new Scene(border, 400, 400);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		opretkamp.setScene(scene);
		opretkamp.show();
		
		
	}
}
