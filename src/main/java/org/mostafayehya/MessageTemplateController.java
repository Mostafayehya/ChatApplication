package org.mostafayehya;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import org.mostafayehya.model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class MessageTemplateController implements Initializable {

    User user;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        user = App.getUserData();
        userName.setText(user.getName());
        userAvatarCircle.fillProperty().set(new ImagePattern(user.getImage()));
        messageContent.setText(user.getCurrentMessage());
    }

    @FXML
    private Label userName;

    @FXML
    private Circle userAvatarCircle;

    @FXML
    private Label messageContent;



}
