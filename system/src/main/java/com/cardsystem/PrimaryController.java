package com.cardsystem;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import com.controller.*;

public class PrimaryController {

    @FXML
    private Button primaryButton;

    @FXML
    private void login() throws IOException {
        CardSystemFacade cardSystem = CardSystemFacade.getInstance();
        String userName = "pplante";
        String password = "12345";
        if(cardSystem.login(userName, password)){
            Account currentUser = cardSystem.getCurrentAccount();
            System.out.println("Welcome " + currentUser.getUserName());
        }
        //App.setRoot("secondary");
    }

    @FXML
    void switchToSecondary(ActionEvent event) {

    }
}
