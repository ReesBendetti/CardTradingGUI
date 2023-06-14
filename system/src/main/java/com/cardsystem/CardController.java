package com.cardsystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import com.controller.*;

public class CardController implements Initializable{

    @FXML
    private Text playerName;
    @FXML private Text playerPosition;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        CardSystemFacade cardSystem = CardSystemFacade.getInstance();
        Card currentCard = cardSystem.getCurrentCard();
        playerName.setText(currentCard.getFirstName() + " " + currentCard.getLastName());
        playerPosition.setText(currentCard.getPlayerPosition());
    }
    
}