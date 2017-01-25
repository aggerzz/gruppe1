package presentation;

import java.sql.SQLException;
import java.util.List;

import data.DataAccess;
import data.Ligadata;
import domain.Hold;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LigaOversigt {
	Ligadata ligadb;

	public void start(Stage ligaoversigt) {
		ligadb = new Ligadata();
		ligaoversigt.setTitle("Liga Oversigt");

		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER);
		grid.setGridLinesVisible(false);

		// Label
		// Label lhold = new Label(" Hold ");
		// grid.add(lhold, 1, 0);
		// Label lks = new Label(" KS ");
		// grid.add(lks, 2, 0);
		// Label lvundet = new Label(" V ");
		// grid.add(lvundet, 3, 0);
		// Label luafgjordt = new Label(" U ");
		// grid.add(luafgjordt, 4, 0);
		// Label ltabt = new Label(" T ");
		// grid.add(ltabt, 5, 0);
		// Label lmaal = new Label(" Mål ");
		// grid.add(lmaal, 6, 0);
		// Label lpoint = new Label(" Point ");
		// grid.add(lpoint, 7, 0);
		// Label ludvisninger = new Label(" Udvisninger ");
		// grid.add(ludvisninger, 8, 0);

		// lav ligaoversigt liste med TableView TODO

		try {
			grid.add(createholdtable(ligadb.visLiga_Oversigt(new DataAccess(), "2017")), 0, 0);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Button gkamp = new Button("Luk vinduet");
		grid.add(gkamp, 0, 1);
		gkamp.setOnAction(e -> {
			ligaoversigt.close();
		});

		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		ligaoversigt.setScene(scene);
		ligaoversigt.show();

	}

	private TableView<Hold> createholdtable(List<Hold> holdliste) {
		TableView<Hold> table = new TableView<Hold>();
		ObservableList<Hold> observableholdlist = FXCollections.observableArrayList(holdliste);

		TableColumn<Hold, String> navnCol = new TableColumn<Hold, String>("Navn");
		navnCol.setCellValueFactory(new PropertyValueFactory<Hold, String>("holdnavn"));

		table.setItems(observableholdlist);
		table.getColumns().addAll(navnCol);
		return table;
	}
}
