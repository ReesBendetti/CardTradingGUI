package com.cardsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.security.auth.login.CredentialException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
//-------------------------------------
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import com.controller.*;
import javafx.scene.control.ListView;

public class WelcomeController implements Initializable{

    @FXML
    private Label welcomeLbl;

    @FXML
    private VBox cardList;

    @FXML private ImageView img_card;
    @FXML private ListView list_cards;
    @FXML private ImageView base1; @FXML private ImageView base2; @FXML private ImageView base3; @FXML private ImageView base4; @FXML private ImageView base5;
    @FXML private ImageView bask1; @FXML private ImageView bask2; @FXML private ImageView bask3; @FXML private ImageView bask4; @FXML private ImageView bask5;
    @FXML private ImageView foot1; @FXML private ImageView foot2; @FXML private ImageView foot3; @FXML private ImageView foot4; @FXML private ImageView foot5;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        CardSystemFacade cardSystem = CardSystemFacade.getInstance();
        Account account = cardSystem.getCurrentAccount();
        welcomeLbl.setText("Welcome " + account.getUserName());
    
    ArrayList<Card> myCards = ((User)account).getCards();
        
       /*  for(Card card : myCards){
            Label cardLabel = new Label(card.getFirstName() + " " + card.getLastName());
            cardList.getChildren().add(cardLabel);
            
        }*/
        displayUserCards();
    }
    
    private void displayUserCards(){
        CardSystemFacade cardSystem = CardSystemFacade.getInstance();
        Account account = cardSystem.getCurrentAccount();
        ArrayList<Card> myCards = ((User)account).getCards();
        ObservableList<Card> card_list =FXCollections.observableArrayList ();
        for(Card card : myCards) {
            card_list.add(card);
        }
        list_cards.setItems(card_list);
    }

    @FXML
    void showCard(MouseEvent event) throws IOException {
        Card card = (Card)list_cards.getSelectionModel().getSelectedItem();
        CardSystemFacade.getInstance().setCurrentCard(card);
        App.setRoot("card");

        if (event.getSource() == base1) {

        } else if (event.getSource() == base2) {

        } else if (event.getSource() == base3) {

        } else if (event.getSource() == base4) {

        } else if (event.getSource() == base5) {

        } else if (event.getSource() == bask1) {

        } else if (event.getSource() == bask2) {

        } else if (event.getSource() == bask3) {

        } else if (event.getSource() == bask4) {

        } else if (event.getSource() == bask5) {

        } else if (event.getSource() == foot1) {

        } else if (event.getSource() == foot2) {

        } else if (event.getSource() == foot3) {

        } else if (event.getSource() == foot4) {

        } else if (event.getSource() == foot5) {
            
        }
    }
}