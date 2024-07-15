package com.cryptography.controllers;

import com.cryptography.utils.FileContent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {
    @FXML
    private ComboBox<String> modeSelection;

    @FXML
    public TextArea encryptTextArea;

    @FXML
    public void initialize() {
        modeSelection.getItems().addAll("Encrypt", "Decrypt", "Brute-force", "Analysis");
        modeSelection.getSelectionModel().selectFirst();

        FileContent example = new FileContent();
        String content = example.getContent("src/sample/example.txt");
        encryptTextArea.setText(content);
    }
}