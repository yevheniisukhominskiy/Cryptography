module com.cryptography {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cryptography to javafx.fxml;
    exports com.cryptography;
}