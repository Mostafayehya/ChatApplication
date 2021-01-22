package org.mostafayehya;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import org.mostafayehya.model.User;

public class ChatScreenController implements Initializable {

    User user;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        user = App.getUserData();
        userImage.setImage(user.getImage());
        userName.setText(user.getName());
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