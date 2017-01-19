package presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LigaOversigt {
	public void start(Stage ligaoversigt) {
		ligaoversigt.setTitle("Liga Oversigt");
		
		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER);
		grid.setGridLinesVisible(true);

		// Label
		Label lhold = new Label(" Hold ");
		grid.add(lhold, 1, 0);
		Label lks = new Label(" KS ");
		grid.add(lks, 2, 0);
		Label lvundet = new Label(" V ");
		grid.add(lvundet, 3, 0);
		Label luafgjordt = new Label(" U ");
		grid.add(luafgjordt, 4, 0);
		Label ltabt = new Label(" T ");
		grid.add(ltabt, 5, 0);
		Label lmaal = new Label(" Mål ");
		grid.add(lmaal, 6, 0);
		Label lpoint = new Label(" Point ");
		grid.add(lpoint, 7, 0);
		Label ludvisninger = new Label(" Udvisninger ");
		grid.add(ludvisninger, 8, 0);
		
		Button gkamp = new Button("Luk vinduet");
		grid.add(gkamp, 9, 0);
		gkamp.setOnAction(e -> {
			ligaoversigt.close();
		});
		
		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		ligaoversigt.setScene(scene);
		ligaoversigt.show();

	}
}
