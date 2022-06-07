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
        msgField.clear();
        msgField.requestFocus();

    }

    private boolean ifWantToWriteAgain() {

        final Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Введите сообщение",
                new ButtonType("Да", ButtonBar.ButtonData.YES),
                new ButtonType("Нет", ButtonBar.ButtonData.NO));

        final ButtonType answer = alert.showAndWait().get();
        return answer.getButtonData() == ButtonBar.ButtonData.YES;

    }

    public void sendMessage

}
