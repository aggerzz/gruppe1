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

public class Sog {
	List<Soeg> holdlist;
	private ObservableList<Soeg> observablesog;
	TableView<Soeg> table = new TableView<Soeg>();
	public void start(Stage soeg) {
		soeg.setTitle("SØG");

		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane grid = new GridPane();
		border.setCenter(grid);
		grid.setAlignment(Pos.CENTER);
		grid.setGridLinesVisible(true);

		Label lholdnavn = new Label("Søg på holdnavn: ");
		grid.add(lholdnavn, 0, 1);
		TextField tholdnavn = new TextField();
		grid.add(tholdnavn, 1, 1);
		
		Button ligaoversigt = new Button("Søg");
		grid.add(ligaoversigt, 1, 2);
		ligaoversigt.setOnAction(e -> {
			Soeg hold = new Soeg();
			hold.setHoldnavn(tholdnavn.getText());
			
			KampRegProImpl logic = new KampRegProImpl();
			holdlist = logic.sogListe(hold);
			
			observablesog = FXCollections.observableArrayList(holdlist);
			table.setItems(observablesog);
			soeg.show();
		});

		Button tilbage = new Button("Tilbage");
		grid.add(tilbage, 0, 2);
		tilbage.setOnAction(e -> {
			soeg.close();
		});

		TableColumn<Soeg, String> holdid = new TableColumn<Soeg, String>("Holdid");
		holdid.setCellValueFactory(new PropertyValueFactory<Soeg, String>("holdid"));

		TableColumn<Soeg, String> holdnavn = new TableColumn<Soeg, String>("Holdnavn");
		holdnavn.setCellValueFactory(new PropertyValueFactory<Soeg, String>("holdnavn"));

		grid.add(table, 0,3);
		table.getColumns().addAll(holdid, holdnavn);

		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		soeg.setScene(scene);
		soeg.show();
	}

}