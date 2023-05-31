package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController  {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;

    /**
     * Инициализация контроллера.
     */
    @FXML
    void init() {
        button1.setCursor(Cursor.HAND);
        button1.setPickOnBounds(true);
        button1.setOnMouseClicked((e) -> {
            openScene("1.fxml", button1);
        });

        button2.setCursor(Cursor.HAND);
        button2.setPickOnBounds(true);
        button2.setOnMouseClicked((e) -> {
            openScene("hello-view.fxml", button2);
        });

        button3.setCursor(Cursor.HAND);
        button3.setPickOnBounds(true);
        button3.setOnMouseClicked((e) -> {
            openScene("3.fxml", button3);
        });

        button4.setCursor(Cursor.HAND);
        button4.setPickOnBounds(true);
        button4.setOnMouseClicked((e) -> {
            openScene("3.fxml", button4);
        });
    }

    public static void openScene(String window, Button button) {
        Stage stage = (Stage) button.getScene().getWindow();
        stage.hide();

        FXMLLoader loader = new FXMLLoader(HelloController.class.getResource(window));
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}