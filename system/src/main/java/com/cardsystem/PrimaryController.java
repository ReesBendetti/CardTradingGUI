package com.cardsystem;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import com.controller.*;

public class PrimaryController {

    @FXML
    private Button primaryButton;

    @FXML
    private TextField userNameTF;

    @FXML
    private TextField passwordTF;

    @FXML
    private void login() throws IOException {
        CardSystemFacade cardSystem = CardSystemFacade.getInstance();
        String userName = userNameTF.getText();
        String password = passwordTF.getText();
        if(cardSystem.login(userName, password)){
            Account currentUser = cardSystem.getCurrentAccount();
            App.setRoot("welcome");
        }
    }

    @FXML
    void switchToSecondary(ActionEvent event) {

    }
}
