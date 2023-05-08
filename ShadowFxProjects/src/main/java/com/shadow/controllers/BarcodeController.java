package com.shadow.controllers;

import com.barcodelib.barcode.Linear;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


import java.io.IOException;

public class BarcodeController{

    @FXML
    private TextField barCodeField;

    @FXML
    private ImageView generatedBarcode;

    @FXML
    private AnchorPane barcodeCover;

    final int REQUIRED_LENGTH = 12;
    Double opacityValue = 0.0;
    @FXML
   void generateCode(ActionEvent event) {
//        System.out.println("Code : " + finalCode + "  Length : " + finalCode.length());

// verify the contents in the barcodeField(text field)
        if(barCodeField.getText().length() < 12 || barCodeField.getText().length() > 12){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "invalid length ("+ barCodeField.getText().length() + ") : required " + REQUIRED_LENGTH, ButtonType.OK);
            alert.show();
//            barCodeField.setText("");
        }else{
            generateBar();
        }
    }

    public void generateBar() {
//        randomly generate the code
        int one = (int)(100 + Math.random() * 900);
        String two = "00000";
        int three = (int)(1000 + Math.random() * 9000);
        String finalCode = one + two + three ;

        try{
            Linear barcode = new Linear();
            barcode.setType(Linear.INTERLEAVED25);
            barcode.setData(barCodeField.getText());
            barcode.setResolution(1080);
            barcode.setI(11.0f);

            String fileName = barCodeField.getText();
            barcode.renderBarcode("D:\\Barcodes\\Fx\\" +"barcode - "+ fileName + ".png");
            Image image = new Image("D:\\Barcodes\\Fx\\"+"barcode - "+fileName+".png");

            barcodeCover.setOpacity(opacityValue);
            generatedBarcode.setImage(image);
        }catch (Exception e){
            System.err.println("Error : " + e.getMessage());
        }
    }

    @FXML
    void closeApplication(ActionEvent event) {
        System.exit(0);
    }


}
