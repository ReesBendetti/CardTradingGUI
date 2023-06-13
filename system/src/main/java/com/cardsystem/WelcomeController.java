package com.cardsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import com.controller.*;

public class WelcomeController implements Initializable{

    @FXML
    private Label welcomeLbl;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        CardSystemFacade cardSystem = CardSystemFacade.getInstance();
        Account account = cardSystem.getCurrentAccount();
        welcomeLbl.setText("Welcome " + account.getUserName());
    
        ArrayList<Card> myCards = ((User)account).getCards();
        
        for(Card card : myCards){
            System.out.println(card);
        }
    }
}