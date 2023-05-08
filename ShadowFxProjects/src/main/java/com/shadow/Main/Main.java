package com.shadow.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("file-chooser.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image image = new Image("C:\\Users\\Admin\\IdeaProjects\\ShadowFxProjects\\src\\main\\resources\\com\\shadow\\Main\\icons\\loadingIcon.png");
        stage.getIcons().add(image);
        stage.setTitle("Progress Bar");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}