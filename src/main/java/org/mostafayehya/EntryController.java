package org.mostafayehya;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import org.mostafayehya.model.User;

public class EntryController implements Initializable {

    User user;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        user = new User();
    }

    @FXML
    private Button choosePicButton;

    @FXML
    private TextField userNameTextField;

    @FXML
    private ImageView userImageView;

    @FXML
    private Button enterButton;

    @FXML
    private void enterChatRoom() throws IOException {
        String name =userNameTextField.getText();
        if (name.isEmpty()) {
            // Todo handle Invalid names
        } else {
            user.setName(name);
            App.setUserData(user);
            App.setRoot("ChatScreen");

        }
    }

    @FXML
    public void choosePicture() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg"));
        File selectedFile = fileChooser.showOpenDialog(null);
        Image selectedImage = null;
        try {
            selectedImage = new Image(new FileInputStream(selectedFile.getAbsolutePath()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (selectedFile != null) {
            user.setImage(selectedImage);
            userImageView.setImage(selectedImage);
        }
    }


}
