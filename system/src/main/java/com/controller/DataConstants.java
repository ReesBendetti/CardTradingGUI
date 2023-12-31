package com.controller;
public class DataConstants {
    public static final String USERS_FILE_NAME = "system/src/main/java/com/data/users.json";
    public static final String ADMIN_FILE_NAME = "system/src/main/java/com/data/admin.json";
    public static final String CARDS_FILE_NAME = "system/src/main/java/com/data/cards.json";
    public static final String PROPOSALS_FILE_NAME = "system/src/main/java/com/data/proposal.json";

    //User constants
    public static final String USER_ID = "id";
    public static final String USER_USERNAME = "username";
    public static final String USER_PASSWORD = "password";
    public static final String USER_EMAIL = "email";
    public static final String USER_COINS = "coins";
    public static final String USER_CARDS = "cards";

    //Admin constants
    public static final String ADMIN_ID = "idAdmin";
    public static final String ADMIN_USERNAME = "usernameAdmin";
    public static final String ADMIN_PASSWORD = "passwordAdmin";
    public static final String ADMIN_EMAIL = "emailAdmin";

    //Card constants
    public static final String CARD_ID = "id";
    public static final String CARD_PLAYER_FIRST_NAME = "player-first-name";
    public static final String CARD_PLAYER_LAST_NAME = "player-last-name";
    public static final String CARD_PLAYER_POSITION = "player-position";
    public static final String CARD_SPORTS_LEAGUE = "sports-league";
    public static final String CARD_TEAM_NAME = "team-name";
    public static final String CARD_NUMBER = "card-number";
    public static final String CARD_PLAYER_TRIVIA = "plyer-trivia";
    public static final String CARD_RARITY_TYPE = "rarity type";
    public static final String CARD_IS_ROOKIE = "is-rookie";
    public static final String CARD_NUMBER_TOTAL_CARDS = "number-total-cards";
    public static final String CARD_TOTAL_CARD_INVENTORY = "total-cards-inventory";
    
    //Proposal constants
    public static final String PROPOSAL_SENDER = "sender";
    public static final String PROPOSAL_RECEIVER = "reciever";
    public static final String PROPOSAL_SENDER_CARDS = "sender-cards";
    public static final String PROPOSAL_RECEIVER_CARDS = "reciever-cards";
    public static final String PROPOSAL_STATUS = "status";
}
