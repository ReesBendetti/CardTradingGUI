package com.controller;
import java.util.ArrayList;
import java.util.UUID;
public class Card {
    private UUID id;
    private String playerFirstName;
    private String playerLastName;
    private String playerPosition;
    private String teamName;
    private String sportsLeague;
    private int cardNumber;
    private String playerTrivia;
    private String rarityType;
    private Boolean isRookie;
    private int numCardsTotal;
    private int numCardsInInventory;
    private ArrayList<User> users = new ArrayList<User>();
    

    public Card(UUID id, String playerFirstName, String playerLastName, String playerPosition, String sportsLeague, String teamName, int cardNumber, String playerTrivia, String rarityType, Boolean isRookie, int numCardsTotal, int numCardsInventory) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerPosition = playerPosition;
        this.teamName = teamName;
        this.cardNumber = cardNumber;
        this.sportsLeague = sportsLeague;
        this.playerTrivia = playerTrivia;
        this.rarityType = rarityType;
        this.isRookie = isRookie;
        this.numCardsTotal = numCardsTotal;
        this.numCardsInInventory = numCardsInventory;
        this.id = id;
    }

    public Card(String playerFirstName, String playerLastName, String playerPosition, String sportsLeague, String teamName, int cardNumber, String playerTrivia, String rarityType, Boolean isRookie, int numCardsTotal) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerPosition = playerPosition;
        this.sportsLeague = sportsLeague;
        this.teamName = teamName;
        this.cardNumber = cardNumber;
        this.playerTrivia = playerTrivia;
        this.rarityType = rarityType;
        this.isRookie = isRookie;
        this.numCardsTotal = numCardsTotal;
        this.numCardsInInventory = numCardsTotal;
        id = UUID.randomUUID();
    }

    public UUID getId(){
        return id;
    }

    public double getValue() {
        return 0.0;
    }
    public ArrayList<User> getOwners() {
        return users;
    }
    public String getFirstName() {
        return playerFirstName;
    }
    public String getLastName() {
        return playerLastName;
    }
    public String getPlayerPosition() {
        return playerPosition;
    }
    public String getSportLeague() {
        return sportsLeague;
    }
    public String getTeamName() {
        return teamName;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public String getPlayerTrivia() {
        return playerTrivia;
    }
    public String getRarityType() {
        return rarityType;
    }
    public Boolean isRookie() {
        return true;
    }
    public int getNumberCardsTotal() {
        return numCardsTotal;
    }
    public int getNumberCardsInventory() {
        return numCardsInInventory;
    }

    private String getStarLine(){
        String line = "";
        for(int i=0; i < 30; i++){
            line += "*";
        }
        return line + "\n";
    }

    private String getSpaces(int count){
        String line = "";
        for(int i=0; i < count; i++){
            line += " ";
        }
        return line;
    }

    private String getLine(String data){
        String line = "*";
        int extra = 28 - data.length();
        int leadingSpaces = extra / 2;
        int trailingSpaces = extra - leadingSpaces;

        line += getSpaces(leadingSpaces) + data + getSpaces(trailingSpaces);
        line += "*\n";
        return line;
    } 

    public void addUser(User user){
        users.add(user);
    }

    public String toString(){
        return playerFirstName + " " + playerLastName;
    }

    public String toStringOld(){
        String cardDisplay = "";
        cardDisplay += getStarLine();
        cardDisplay += getLine(playerFirstName + " " + playerLastName);
        cardDisplay += getLine(playerPosition);
        cardDisplay += getLine(sportsLeague);

        cardDisplay += getStarLine();

        return cardDisplay;
    }
}
