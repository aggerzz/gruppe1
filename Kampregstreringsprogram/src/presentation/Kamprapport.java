package presentation;

import java.util.List;

import domain.Kamp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import logic.KampRegProImpl;

public class Kamprapport {
	List<Kamp> kampliste;
	private ObservableList<Kamp> observablekamp;
	TableView<Kamp> table = new TableView<Kamp>();

	public void start(Stage kamprapport) {
		kamprapport.setTitle("Kamprapport");

		// Border
		BorderPane border = new BorderPane();
		// Grid
		GridPane gridtop = new GridPane();
		border.setTop(gridtop);
		gridtop.setAlignment(Pos.CENTER);
		gridtop.setGridLinesVisible(true);
		// GridPane gridcenter = new GridPane();
		// border.setCenter(gridcenter);
		// gridcenter.setGridLinesVisible(true);

		// Button sog = new Button("Søg");
		// grid.add(sog, 0, 1);
		// sog.setOnAction(e -> {
		// Sog soeg = new Sog();
		// soeg.start(new Stage());
		// });

		TextField sogkamp = new TextField();
		gridtop.add(sogkamp, 0, 0);

		Button sog = new Button("Søg i kamprapport");
		gridtop.add(sog, 1, 0);
		sog.setOnAction(e -> {
			Kamp kamp = new Kamp();
			kamp.setHjemmehold(sogkamp.getText());
			kamp.setUdehold(sogkamp.getText());

			KampRegProImpl logic = new KampRegProImpl();
			kampliste = logic.sogKampe(kamp);

			observablekamp = FXCollections.observableArrayList(kampliste);
			table.setItems(observablekamp);
			kamprapport.show();
		});

		Button tilbage = new Button("Tilbage");
		gridtop.add(tilbage, 2, 0);
		tilbage.setOnAction(e -> {
			kamprapport.close();
		});

		TableColumn<Kamp, String> hjemmehold = new TableColumn<Kamp, String>("Hjemmehold");
		hjemmehold.setCellValueFactory(new PropertyValueFactory<Kamp, String>("hjemmehold"));
		TableColumn<Kamp, String> udehold = new TableColumn<Kamp, String>("Udehold");
		udehold.setCellValueFactory(new PropertyValueFactory<Kamp, String>("udehold"));
		TableColumn<Kamp, String> hjemmeholdmaal = new TableColumn<Kamp, String>("Hjemmehold Mål");
		hjemmeholdmaal.setCellValueFactory(new PropertyValueFactory<Kamp, String>("hjemmehold_maal"));
		TableColumn<Kamp, String> udeholdmaal = new TableColumn<Kamp, String>("Udehold Mål");
		udeholdmaal.setCellValueFactory(new PropertyValueFactory<Kamp, String>("udehold_maal"));
		TableColumn<Kamp, String> hjemmeholdudvisninger = new TableColumn<Kamp, String>("H. Udvisninger");
		hjemmeholdudvisninger.setCellValueFactory(new PropertyValueFactory<Kamp, String>("hjemmehold_udvisning"));
		TableColumn<Kamp, String> udeholdudvisninger = new TableColumn<Kamp, String>("U. Udvisninger");
		udeholdudvisninger.setCellValueFactory(new PropertyValueFactory<Kamp, String>("udehold_udvisning"));
		TableColumn<Kamp, String> kampid = new TableColumn<Kamp, String>("KampID");
		kampid.setCellValueFactory(new PropertyValueFactory<Kamp, String>("kampid"));

		border.setCenter(table);
		table.getColumns().addAll(hjemmehold, udehold, hjemmeholdmaal, udeholdmaal, hjemmeholdudvisninger,
				udeholdudvisninger, kampid);

		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		kamprapport.setScene(scene);
		kamprapport.show();

	}
}
