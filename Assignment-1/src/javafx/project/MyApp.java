/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.project;

import View.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Elias
 */
public class MyApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewManager.openLoginPage();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
