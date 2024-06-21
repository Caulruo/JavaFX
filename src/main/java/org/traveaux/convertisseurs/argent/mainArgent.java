package org.traveaux.convertisseurs.argent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class mainArgent extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader l = new FXMLLoader(this.getClass().getClassLoader().getResource("convertisseurs/argent.fxml"));
        BorderPane root = l.load();
        Scene scene = new Scene(root);
        stage.setTitle("Convertisseur argent");
        stage.setScene(scene);
        stage.show();
    }
}
