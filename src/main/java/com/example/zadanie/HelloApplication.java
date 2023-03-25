package com.example.zadanie;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Tworzenie przycisku
        Button button = new Button("Kliknij mnie");
        Button button = new Button("Kliknij mnie");
        Button button = new Button("Kliknij mnie");
        Button button = new Button("Kliknij mnie");
        Button button = new Button("Kliknij mnie");
        Button button = new Button("Kliknij mnie");
        Button button = new Button("Kliknij mnie");

        // Tworzenie tła z prostokątem
        Rectangle background = new Rectangle();
        background.setWidth(300);
        background.setHeight(200);
        background.setFill(Color.WHITE);

        // Tworzenie pane dla tła i przycisku
        Pane pane = new Pane();
        pane.getChildren().addAll(background, button);

        // Ustawienie położenia przycisku
        button.setLayoutX(100);
        button.setLayoutY(75);

        // Dodanie zdarzenia dla przycisku
        button.setOnAction(event -> {

            // Ustawienie przezroczystości tła na 50%
            background.setFill(Color.WHITE.deriveColor(0, 0, 0, 1));
            // Ustawienie przezroczystości wszystkich kontrolek na 50%
            for (Node node : pane.getChildren()) {
                node.setOpacity(0.5);
            }





            // Tworzenie nowej sceny z przyciskiem
            Button newSceneButton = new Button("Przycisk w nowej scenie");
            StackPane newSceneRoot = new StackPane(newSceneButton);
            Scene newScene = new Scene(newSceneRoot, 300, 200);

            // Tworzenie nowego okna dla nowej sceny
            Stage newStage = new Stage();
            newStage.setTitle("Nowa Scena");
            newStage.initModality(Modality.WINDOW_MODAL);
            newStage.initOwner(primaryStage);
            newStage.setScene(newScene);

            // Wyświetlenie nowej sceny
            newStage.showAndWait();






            // Przywrócenie pełnej przezroczystości tła
            background.setFill(Color.WHITE);

            // Przywrócenie pełnej przezroczystości wszystkich kontrolek
            for (Node node : pane.getChildren()) {
                node.setOpacity(1.0);
            }
        });

        // Utworzenie i konfiguracja okna
        primaryStage.setTitle("Przykład z kryciem tła");
        primaryStage.setScene(new Scene(pane, 300, 200));
        primaryStage.show();
    }
}
