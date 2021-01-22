package org.mostafayehya;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import org.mostafayehya.model.User;

public class ChatScreenController implements Initializable {

    User user;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        user = App.getUserData();
        userImage.setImage(user.getImage());
        userName.setText(user.getName());

        messageField.setOnKeyPressed(keyEvent -> {

            if (keyEvent.getCode() == KeyCode.ENTER) {
                user.setCurrentMessage(messageField.getText());
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MessageTemplate.fxml"));
                try {
                    chatField.getChildren().add(fxmlLoader.load());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @FXML
    private ImageView userImage;
    @FXML
    private Label userName;
    @FXML
    private VBox chatField;
    @FXML
    private TextField messageField;
    @FXML
    private Button sendButton;


    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Entry");
    }
}