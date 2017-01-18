package presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OpretKamp {

	public void start(Stage opretkamp) {
		opretkamp.setTitle("Kamp");

		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER);
		grid.setGridLinesVisible(true);

		// kampid
		Label label_kampid = new Label("Kampid: ");
		grid.add(label_kampid, 0, 0);
		TextField textfield_kampid = new TextField();
		grid.add(textfield_kampid, 1, 0);

		// Hjemmeholdet
		Label lhjemmehold = new Label("Hjemmehold: ");
		grid.add(lhjemmehold, 0, 1);
		TextField thjemmehold = new TextField();
		grid.add(thjemmehold, 1, 1);

		// hjemmehold mål
		Label label_hjemmehold_maal = new Label("Hjemmehold Mål: ");
		grid.add(label_hjemmehold_maal, 0, 2);
		TextField textfield_hjemmehold_maal = new TextField();
		grid.add(textfield_hjemmehold_maal, 1, 2);

		// hjemmehold udvisning
		Label label_hjemmehold_udvisning = new Label("Hjemmehold udvisning: ");
		grid.add(label_hjemmehold_udvisning, 0, 3);
		TextField textfield_hjemmehold_udvisning = new TextField();
		grid.add(textfield_hjemmehold_udvisning, 1, 3);

		// Udeholdet
		Label ludehold = new Label("UdeHold: ");
		grid.add(ludehold, 0, 4);
		TextField tudehold = new TextField();
		grid.add(tudehold, 1, 4);

		// udehold mål
		Label label_udehold_maal = new Label("Udehold Mål: ");
		grid.add(label_udehold_maal, 0, 5);
		TextField textfield_udehold_maal = new TextField();
		grid.add(textfield_udehold_maal, 1, 5);

		// udehold udvisning
		Label label_udehold_udvisning = new Label("Udehold udvisning: ");
		grid.add(label_udehold_udvisning, 0, 6);
		TextField textfield_udehold_udvisning = new TextField();
		grid.add(textfield_udehold_udvisning, 1, 6);
		// Kampstatus
		Label label_kampstatus = new Label("Kampstatus (0 ikke spillet | 1 igang | 2 færdig): ");
		grid.add(label_kampstatus, 0, 7);
		TextField textfield_kampstatus = new TextField();
		grid.add(textfield_kampstatus, 1, 7);
		
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
		opretkamp.setScene(scene);
		opretkamp.show();

	}
}
