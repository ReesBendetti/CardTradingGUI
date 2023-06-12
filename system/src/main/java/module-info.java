module com.cardsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cardsystem to javafx.fxml;
    exports com.cardsystem;
}
