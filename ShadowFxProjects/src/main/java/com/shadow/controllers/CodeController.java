package com.shadow.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class CodeController {

    String charSet = "#include <stdio.h> int main(){}";
    @FXML
    private Button startButton;

    @FXML
    private TextArea textArea;
    @FXML
    private Label text;

    @FXML
    void startWriting(ActionEvent event) {
        char [] a = charSet.toCharArray();
        String result = "";
        text.setText(charSet);

        try{
            for (int i =0; i < a.length; ++i){
                System.out.print(a[i] + " ");
                result += a[i];
                textArea.setText(result);
                Thread.sleep(100);
                result.split(">");
//                textArea.setText(result);
            }
        } catch (InterruptedException e) {
            System.err.println("Error : " + e.getMessage());
        }

    }


}
