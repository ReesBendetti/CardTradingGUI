package com.cardsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import java.io.IOException;
import javafx.event.ActionEvent;


import javax.security.auth.login.CredentialException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
//-------------------------------------
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import com.controller.*;
import javafx.scene.control.ListView;

public class WelcomeController implements Initializable{

    @FXML
    private GridPane card_grid;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        CardSystemFacade cardSystem = CardSystemFacade.getInstance();
        User user = (User)cardSystem.getCurrentAccount();
        ArrayList<Card> cards = user.getCards();



        //Setting size for the pane
        card_grid.setMinSize(400, 200);
        //Setting the padding
        card_grid.setPadding(new Insets(10, 10, 10, 10));
        //Setting the vertical and horizontal gaps between the columns
        card_grid.setVgap(5);
        card_grid.setHgap(5);


        int row = 0;
        int col = 0;

        for(Card card: cards){
            String playerName = card.getFirstName() + card.getLastName() + ".png";
            Image image = new Image(getClass().getResourceAsStream("/com/cardsystem/images/CardPictures/"+playerName));
            ImageView imageView = new ImageView();
            imageView.setImage(image);
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);

            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                    CardSystemFacade.getInstance().setCurrentCard(card);
                    System.out.println("card clicked");
                    try {
                        App.setRoot("card");
                    } catch(Exception e){
                        System.out.println("Exception.");
                    }
                    
                };
            });

            card_grid.add(imageView, row, col);
            row++;
            if (row == 5) {
                row = 0; 
                col++;
            }
        }
       
    }
}