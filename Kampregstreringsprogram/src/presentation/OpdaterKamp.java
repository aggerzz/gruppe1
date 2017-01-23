package presentation;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import domain.Kamp;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import logic.KampRegProImpl;
import logic.KampRegProInterface;

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

		// Felter i center border og i grid griddet x aksen
		Label lmal = new Label(" Mål ");
		grid.add(lmal, 1, 0);
		Label ludvisninger = new Label(" Udvisninger ");
		grid.add(ludvisninger, 2, 0);

		// Felter i center border y aksen
		Label hjemmehold = new Label("Hjemmehold: ");
		grid.add(hjemmehold, 0, 1);
		TextField thjemmeholdmal = new TextField();
		grid.add(thjemmeholdmal, 1, 1);
		TextField thjemmeholdudv = new TextField();
		grid.add(thjemmeholdudv, 2, 1);
		Label udehold = new Label("UdeHold: ");
		grid.add(udehold, 0, 2);
		TextField tudeholdmal = new TextField();
		grid.add(tudeholdmal, 1, 2);
		TextField tudeholdudv = new TextField();
		grid.add(tudeholdudv, 2, 2);
		Label antal = new Label("Antal: ");
		grid.add(antal, 0, 3);
		TextField antalm = new TextField();
		grid.add(antalm, 1, 3);
		TextField antalu = new TextField();
		grid.add(antalu, 2, 3);
		Label tid = new Label("Tid: ");
		grid.add(tid, 0, 4);
		TextField tidm = new TextField();
		grid.add(tidm, 1, 4);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh-mm-ss");
		tidm.setText(LocalTime.valueof().formatter(formatter));
		TextField tidu = new TextField();
		grid.add(tidu, 2, 4);
		// TODO Tid
		Label hold = new Label("Hold: ");
		grid.add(hold, 0, 5);
		TextField holdm = new TextField();
		grid.add(holdm, 1, 5);
		TextField holdu = new TextField();
		grid.add(holdu, 2, 5);

		// Knapper
		Button gmal = new Button("Gem Mål");
		grid.add(gmal, 1, 8);
		gmal.setOnAction(e -> {
			try {
				KampRegProInterface krpi = new KampRegProImpl();
				Kamp kamp = new Kamp();
				int maalhjemmehold = Integer.parseInt(thjemmeholdmal.getText());
				kamp.setHjemmehold_maal(maalhjemmehold); 
				int maaludehold = Integer.parseInt(tudeholdmal.getText());
				kamp.setUdehold_maal(maaludehold);
				kamp.setHjemmehold(thjem.getText());
				int idkamp = Integer.parseInt(tkampid.getText());
				kamp.setKampid(idkamp);
				kamp.setUdehold(tude.getText());
				//noget med tid TODO
				
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
				Fejlvindue fejlvindue = new Fejlvindue();
				fejlvindue.start(new Stage());}
		});
		Button gudvisning = new Button("Gem Udvisning");
		grid.add(gudvisning, 2, 8);
		gudvisning.setOnAction(e -> {
			try {
				KampRegProInterface krpi = new KampRegProImpl();
				Kamp kamp = new Kamp();
				kamp.setHjemmehold(thjem.getText());
				int idkamp = Integer.parseInt(tkampid.getText());
				kamp.setKampid(idkamp);
				kamp.setUdehold(tude.getText());
				int udvisningudehold = Integer.parseInt(tudeholdudv.getText());
				kamp.setUdehold_udvisning(udvisningudehold);
				int udvisninghjemmehold = Integer.parseInt(thjemmeholdudv.getText());
				kamp.setHjemmehold_udvisning(udvisninghjemmehold);
				// noget med tid
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
				Fejlvindue fejlvindue = new Fejlvindue();
				fejlvindue.start(new Stage());}
			
		});
		Button luk = new Button("Luk Vinduet");
		grid.add(luk, 1, 9);
		luk.setOnAction(e -> {
			opdaterkamp.close();
		});
		Button gkamp = new Button("Gem Kamp");
		grid.add(gkamp, 2, 9);
		gkamp.setOnAction(e -> {
		});

		Scene scene = new Scene(border, 700, 500);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		opdaterkamp.setScene(scene);
		opdaterkamp.show();

	}
}
