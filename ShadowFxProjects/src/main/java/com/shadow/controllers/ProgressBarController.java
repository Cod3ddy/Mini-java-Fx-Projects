package com.shadow.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ProgressBarController implements Initializable {
    @FXML
    private ProgressBar progressBar;

    @FXML
    private Text text;

    @FXML
     private Button subBtn;

    @FXML
    private Button addBtn;

    Double points = 0.0;
    @FXML
    void addPoints(MouseEvent event) {
        points +=0.1;
        progressBar.setProgress(points);
        text.setText(Double.toString(Math.floor(points*100.0)/100.0));
        if(points > 1.0){
            points = 1.0;
            progressBar.setProgress(points);
            text.setText(Double.toString(points));
            addBtn.setDisable(true);
        }
        if (points <= 1.0){
            addBtn.setDisable(false);
        }
    }

    @FXML
    void subtractPoints(MouseEvent event) {
        points -=0.1;
        progressBar.setProgress(points);
        text.setText(Double.toString(Math.round(points*100.0)/100.0));
        if(points < 0.0){
            points = 0.0;
            progressBar.setProgress(points);
            text.setText(Double.toString(points));
            subBtn.setDisable(true);
        }
        if (points <= 0.0){
            subBtn.setDisable(false);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        text.setText(Double.toString(points));
    }


}