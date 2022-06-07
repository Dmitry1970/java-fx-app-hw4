package ru.gb.javafxapphw4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class Controller {
    @FXML
    private TextArea historyArea;
    @FXML
    private TextField msgField;

    public void clickCheckButton(ActionEvent actionEvent) {
        final String message = msgField.getText();
        sendMessage();
        msgField.clear();
        msgField.requestFocus();

    }

    public void sendMessage() {
        historyArea.appendText(msgField.getText() + "\n");

    }
}







