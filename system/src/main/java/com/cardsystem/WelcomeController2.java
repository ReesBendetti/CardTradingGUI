package com.cardsystem;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import com.controller.*;

public class WelcomeController2 implements Initializable{
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        //Creating a Grid Pane
      GridPane gridPane = new GridPane();
      
        CardSystemFacade cardSystem = CardSystemFacade.getInstance();
        User user = (User)cardSystem.getCurrentAccount();
        ArrayList<Card> cards = user.getCards();

        for(Card card: cards){
            String playerName = card.getFirstName() + card.getLastName() + ".png";
            Image image = new Image(getClass().getResourceAsStream("com/images/CardPictures" + playerName);
            ImageView imageView = new ImageView();
            imageView.setImage(image);
            gridPane.add(image, 0, 0);
        }
    }
}
