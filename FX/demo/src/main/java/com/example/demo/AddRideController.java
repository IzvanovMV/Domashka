package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;

import static com.example.demo.HelloController.openScene;

public class AddRideController {

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;

    @FXML
    void init() {
        button1.setCursor(Cursor.HAND);
        button1.setOnMouseClicked((e) -> {
            openScene("1.fxml", button1);
        });

        button2.setCursor(Cursor.HAND);
        button2.setOnMouseClicked((e) -> {
            openScene("hello-view.fxml", button2);
        });

        button3.setCursor(Cursor.HAND);
        button3.setOnMouseClicked((e) -> {
            openScene("3.fxml", button3);
        });

        button4.setCursor(Cursor.HAND);
        button4.setOnMouseClicked((e) -> {
            openScene("3.fxml", button4);
        });
    }

}
