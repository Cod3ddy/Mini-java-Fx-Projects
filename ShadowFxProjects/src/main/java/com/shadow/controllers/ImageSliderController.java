package com.shadow.controllers;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class ImageSliderController implements Initializable {

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private Text text;

    int counter = 0;
    @FXML
    void nextImage(MouseEvent event) {
        counter +=1;
        text.setText(Integer.toString(counter));
        new Thread(){
            @Override
            public void run() {
                try{
                    while(counter > 0){
                        switch (counter){
                            case 1:{
                                Thread.sleep(2000);
                                TranslateTransition slide1 = new TranslateTransition();
                                slide1.setNode(image1);
                                slide1.setDuration(Duration.seconds(2));
                                slide1.setToX(0);

                                TranslateTransition slider2 = new TranslateTransition();
                                slider2.setNode(image2);
                                slider2.setDuration(Duration.seconds(3));
                                slider2.setToX(0);
                                slider2.play();

                                TranslateTransition slider3 = new TranslateTransition();
                                slider3.setNode(image3);
                                slider3.setDuration(Duration.seconds(3));
                                slider3.setToX(-600);
                                slider3.play();

                                TranslateTransition slider4 = new TranslateTransition();
                                slider4.setNode(image4);
                                slider4.setDuration(Duration.seconds(3));
                                slider4.setToX(-1200);
                                slider4.play();
                                break;
                            }
                        }
                    }


                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }.start();
    }

    @FXML
    void prevImage(MouseEvent event) {
        counter -= 1;
        text.setText(Integer.toString(counter));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        slider();

    }


    private void slider() {
        new Thread(){
            @Override
            public void run() {

                int count = 0;

                try{
                    while(true){
                        switch (count) {
                            case 0:{
                                Thread.sleep(5000);


                                TranslateTransition slider1 = new TranslateTransition();
                                slider1.setNode(image1);
                                slider1.setDuration(Duration.seconds(3));
                                slider1.setToX(0);
                                slider1.play();

                                TranslateTransition slider2 = new TranslateTransition();
                                slider2.setNode(image2);
                                slider2.setDuration(Duration.seconds(3));
                                slider2.setToX(0);
                                slider2.play();

                                TranslateTransition slider3 = new TranslateTransition();
                                slider3.setNode(image3);
                                slider3.setDuration(Duration.seconds(3));
                                slider3.setToX(-600);
                                slider3.play();

                                TranslateTransition slider4 = new TranslateTransition();
                                slider4.setNode(image4);
                                slider4.setDuration(Duration.seconds(3));
                                slider4.setToX(-1200);
                                slider4.play();

                                count = 1;
                                break;
                        }
                            case 1:{
                                Thread.sleep(5000);


                                TranslateTransition slider5 = new TranslateTransition();
                                slider5.setNode(image1);
                                slider5.setDuration(Duration.seconds(3));
                                slider5.setToX(600);
                                slider5.play();

                                TranslateTransition slider6 = new TranslateTransition();
                                slider6.setNode(image2);
                                slider6.setDuration(Duration.seconds(3));
                                slider6.setToX(600);
                                slider6.play();

                                TranslateTransition slider7 = new TranslateTransition();
                                slider7.setNode(image3);
                                slider7.setDuration(Duration.seconds(3));
                                slider7.setToX(0);
                                slider7.play();

                                TranslateTransition slider8 = new TranslateTransition();
                                slider8.setNode(image4);
                                slider8.setDuration(Duration.seconds(3));
                                slider8.setToX(-600);
                                slider8.play();

                                count = 2;
                                break;
                        }
                            case 2:{
                                Thread.sleep(5000);
                                TranslateTransition slider9 = new TranslateTransition();
                                slider9.setNode(image1);
                                slider9.setDuration(Duration.seconds(3));
                                slider9.setToX(1200);
                                slider9.play();

                                TranslateTransition slider10 = new TranslateTransition();
                                slider10.setNode(image2);
                                slider10.setDuration(Duration.seconds(3));
                                slider10.setToX(1200);
                                slider10.play();

                                TranslateTransition slider11 = new TranslateTransition();
                                slider11.setNode(image3);
                                slider11.setDuration(Duration.seconds(3));
                                slider11.setToX(600);
                                slider11.play();

                                TranslateTransition slider12 = new TranslateTransition();
                                slider12.setNode(image4);
                                slider12.setDuration(Duration.seconds(3));
                                slider12.setToX(0);
                                slider12.play();

                                count = 3;
                                break;
                        }
                            case 3: {
                                Thread.sleep(5000);

                                TranslateTransition slider13 = new TranslateTransition();
                                slider13.setNode(image1);
                                slider13.setDuration(Duration.seconds(3));
                                slider13.setToX(1200);


                                TranslateTransition slider14 = new TranslateTransition();
                                slider14.setNode(image2);
                                slider14.setDuration(Duration.seconds(3));
                                slider14.setToX(1200);

                                TranslateTransition slider15 = new TranslateTransition();
                                slider15.setNode(image3);
                                slider15.setDuration(Duration.seconds(3));
                                slider15.setToX(1200);


                                TranslateTransition slider16 = new TranslateTransition();
                                slider16.setNode(image4);
                                slider16.setDuration(Duration.seconds(3));
                                slider16.setToX(600);

                                count = 0;
                                break;
                            }
                        }
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        }.start();
    }

}
