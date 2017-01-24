package presentation;

import java.util.List;

import domain.Soeg;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import logic.KampRegProImpl;
import logic.KampRegProInterface;

public class Sog {
	public void start(Stage sog) {
		sog.setTitle("SØG");

		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER);
		grid.setGridLinesVisible(true);

		Label lsog = new Label("Søg på noget: ");
		grid.add(lsog, 0, 0);
		TextField tsog = new TextField();
		grid.add(tsog, 1, 0);

		Button ligaoversigt = new Button("Søg");
		grid.add(ligaoversigt, 1, 2);
		ligaoversigt.setOnAction(e -> {
		});

		Button tilbage = new Button("Tilbage");
		grid.add(tilbage, 0, 2);
		tilbage.setOnAction(e -> {
			sog.close();
		});

		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		sog.setScene(scene);
		sog.show();
	}

	private TableView<Soeg> createsogtable(List<Soeg> sogListe) {
		TableView<Soeg> table = new TableView<Soeg>();
		ObservableList<Soeg> observeSog = FXCollections.observableArrayList(sogListe);

		TableColumn<Soeg, String> holdid = new TableColumn<Soeg, String>("Holdid");
		holdid.setCellValueFactory(new PropertyValueFactory<Soeg, String>("holdid"));

		TableColumn<Soeg, String> holdnavn = new TableColumn<Soeg, String>("Holdnavn");
		holdnavn.setCellValueFactory(new PropertyValueFactory<Soeg, String>("holdnavn"));

		table.setItems(observeSog);
		grid.add(table, 0,3);
		// table.getColumns().addAll(holdid, holdnavn);
		return table;
	}
}