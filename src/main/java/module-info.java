module com.cryptography {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cryptography to javafx.fxml;
    exports com.cryptography;
    exports com.cryptography.controllers;
    opens com.cryptography.controllers to javafx.fxml;
}