package com.example.pizzza;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Registration {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField LoginReg;

    @FXML
    private TextField NameField;

    @FXML
    private PasswordField PasswordReg;

    @FXML
    private TextField SurnameField;

    @FXML
    private Button registration;

    @FXML
    void initialize() {




        registration.setOnAction(event -> {
            registration.getScene().getWindow().hide();


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("hello-view.fxml"));


            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        });


    }

}