/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ahmed Elias
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField textFieldUsername;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField textFieldPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginButtonHandle(ActionEvent event) throws IOException {
        if ((textFieldUsername.getText().trim().toLowerCase()).equals("user") && textFieldPassword.getText().equals("userpass")) {
            clear();
            ViewManager.closeLoginPage();
            ViewManager.openCurrencyConversionPage();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("There is an error in the username or password");
            alert.setContentText("Please try again.");
            alert.showAndWait();
        }
    }

    private void clear() {
        textFieldUsername.setText("");
        textFieldPassword.setText("");
    }

}
