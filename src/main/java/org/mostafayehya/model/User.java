package org.mostafayehya.model;

import javafx.scene.image.Image;

public class User {

    private Image image;
    private String name;

    public User(){

    }
    public User(Image image, String name) {
        this.image = image;
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
