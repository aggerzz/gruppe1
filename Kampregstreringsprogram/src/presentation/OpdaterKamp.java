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
		grid.setAlignment(Pos.CENTER_RIGHT);
		// grid.setGridLinesVisible(true);
		GridPane gridtop = new GridPane();
		border.setTop(gridtop);
		gridtop.setAlignment(Pos.CENTER);

		// Kampinfo
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

		Label antal = new Label("Antal: ");
		grid.add(antal, 0, 1);
		TextField antalm = new TextField();
		grid.add(antalm, 1, 1);
		TextField antalu = new TextField();
		grid.add(antalu, 2, 1);
		Label tid = new Label("Tid: ");
		grid.add(tid, 0, 2);
		TextField tidm = new TextField();
		grid.add(tidm, 1, 2);
		TextField tidu = new TextField();
		grid.add(tidu, 2, 2);
		Label hold = new Label("Hold: ");
		grid.add(hold, 0, 3);
		TextField holdm = new TextField();
		grid.add(holdm, 1, 3);
		TextField holdu = new TextField();
		grid.add(holdu, 2, 3);

		// Knapper
		Button gmal = new Button("Gem Mål");
		grid.add(gmal, 1, 8);
		gmal.setOnAction(e -> {
		});
		Button gudvisning = new Button("Gem Udvisning");
		grid.add(gudvisning, 2, 8);
		gudvisning.setOnAction(e -> {
		});
		Button gkamp = new Button("Gem Kamp");
		grid.add(gkamp, 3, 9);
		gkamp.setOnAction(e -> {
		});
		Button luk = new Button("Luk Vinduet");
		grid.add(luk, 2, 9);
		luk.setOnAction(e -> {
			opdaterkamp.close();
		});

		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		opdaterkamp.setScene(scene);
		opdaterkamp.show();

	}
}
