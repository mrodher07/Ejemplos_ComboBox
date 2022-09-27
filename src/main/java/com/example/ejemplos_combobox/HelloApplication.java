package com.example.ejemplos_combobox;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("ComboBox");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2 ,1);

        ObservableList<String> opciones =
                FXCollections.observableArrayList(
                        "Opcion 1",
                        "Opcion 2",
                        "Opcion 3",
                        "Opcion 4",
                        "Opcion 5",
                        "Opcion 6"
                );

        ComboBox comboBoxNoEdit = new ComboBox(opciones);
        grid.add(comboBoxNoEdit, 0,1);

        ComboBox comboBoxEdit = new ComboBox(opciones);
        comboBoxEdit.setEditable(true);
        grid.add(comboBoxEdit, 0, 2);

        Scene scene = new Scene(grid, 320, 240);
        stage.setTitle("Ejemplos sobre el componente ComboBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}