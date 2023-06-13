module com.cardsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens com.cardsystem to javafx.fxml;
    exports com.cardsystem;

    opens com.controller to javafx.fxml;

    exports com.controller;
}
