module com.example.zadanie {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;
    requires javafx.swing;

    opens com.example.zadanie to javafx.fxml;
    exports com.example.zadanie;
}