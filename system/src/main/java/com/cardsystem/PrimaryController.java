package com.cardsystem;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

        @FXML
    private Button primaryButton;

    @FXML
    void switchToSecondary(ActionEvent event) {

    }
}
