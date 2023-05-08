package com.shadow.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class FileChooserController implements Initializable {
    @FXML
    private AnchorPane pane;
    @FXML
    private ImageView imageView;
    @FXML
    private ImageView viewport;

    @FXML
    private Label noFileLabel;


    @FXML
    private TextField pathField;


    Stage stage = new Stage();
    @FXML
    void openFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        fileChooser.setInitialDirectory(new File("C:\\"));
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JPEG image", "*.jpg"), new FileChooser.ExtensionFilter("PNG image", "*.png"), new FileChooser.ExtensionFilter("All images", "*.jpg", "*.png"));

        stage  = (Stage) noFileLabel.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        if(selectedFile != null){
            viewport.setVisible(true);
            pathField.setText(selectedFile.getPath());
            Image image = new Image(selectedFile.getPath());
            noFileLabel.setText("");
            imageView.setVisible(false);
            viewport.setImage(image);
        }else{
            noFileLabel.setText("no file selected");
        }
    }

    @FXML
    void closeWindow(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        viewport.setVisible(false);
    }
}
