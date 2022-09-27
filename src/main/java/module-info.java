module com.example.ejemplos_combobox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplos_combobox to javafx.fxml;
    exports com.example.ejemplos_combobox;
}