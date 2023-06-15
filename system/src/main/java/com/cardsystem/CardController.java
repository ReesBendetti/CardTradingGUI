package com.cardsystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import com.controller.*;

public class CardController implements Initializable{

    @FXML
    private Text playerName;
    @FXML private Text playerPosition;
     @FXML private ImageView card_img;
     @FXML private Text teamName;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        CardSystemFacade cardSystem = CardSystemFacade.getInstance();
        Card currentCard = cardSystem.getCurrentCard();
        playerName.setText(currentCard.getFirstName() + " " + currentCard.getLastName());
        String fileName = (currentCard.getFirstName() + currentCard.getLastName()).toLowerCase();

        playerPosition.setText(currentCard.getPlayerPosition());
        teamName.setText(currentCard.getTeamName());
        teamName.setText(currentCard.getTeamName());
         Image image = new Image(getClass().getResourceAsStream("/com/cardsystem/images/" + fileName + ".png"));
         card_img.setImage(image);
    }
    
}