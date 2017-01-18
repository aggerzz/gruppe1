package presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OpdaterKamp {
	public void start(Stage opdaterkamp) {
		opdaterkamp.setTitle("Opdater Kamp");

		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER);
		grid.setGridLinesVisible(true);
		GridPane gridtop = new GridPane();
		border.setTop(gridtop);
		gridtop.setAlignment(Pos.CENTER);

		//Kampinfo
		Label kampid = new Label("KampID:  ");
		gridtop.add(kampid, 0, 0);
		TextField tkampid = new TextField();
		gridtop.add(tkampid, 1, 0);
		
		Label lhjem = new Label("Hjemmeholdet: ");
		gridtop.add(lhjem, 0, 1);
		TextField thjem = new TextField();
		gridtop.add(thjem, 1, 1);
		
		Label lude = new Label("Udeholdet: ");
		gridtop.add(lude, 0, 2);
		TextField tude = new TextField();
		gridtop.add(tude, 1, 2);
		
		// Felter i center border og i grid griddet
		Label lmal = new Label(" Mål ");
		grid.add(lmal, 1, 0);
		Label ludvisninger = new Label(" Udvisninger ");
		grid.add(ludvisninger, 2, 0);
		
		Label lantal = new Label("Antal: ");
		grid.add(lantal, 0, 1);
		TextField tantal = new TextField();
		grid.add(tantal, 1, 1);
		Label ltid = new Label("Tid: ");
		grid.add(ltid, 0, 2);
		TextField ttid = new TextField();
		grid.add(ttid, 2, 2);
		Label lhold = new Label("Hold: ");
		grid.add(lhold, 0, 3);
		TextField thold = new TextField();
		grid.add(thold, 3, 3);
		
		//Knapper 
		Button opretenkamp = new Button("OK");
		grid.add(opretenkamp, 1, 8);
		opretenkamp.setOnAction(e -> {
		});
		Button fortryd = new Button("Fortryd");
		grid.add(fortryd, 0, 8);
		fortryd.setOnAction(e -> {
		});

		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		opdaterkamp.setScene(scene);
		opdaterkamp.show();

	}
}
