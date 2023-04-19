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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Ahmed Elias
 */
public class SystemPageController implements Initializable {

    @FXML
    private Button logoutButton;
    @FXML
    private Button convertButton;
    @FXML
    private TextField textFieldUSD;
    @FXML
    private TextField textFieldNIS;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logoutButtonHandle(ActionEvent event) throws IOException {
        clear();
        ViewManager.closeCurrencyConversionPage();
        ViewManager.openLoginPage();
    }

    @FXML
    private void convertButtonHandle(ActionEvent event) {
        String amountEnteredUSD = textFieldUSD.getText();
        String amountEnteredNIS = textFieldNIS.getText();
        try {
            if ((!amountEnteredUSD.equals("")) && amountEnteredNIS.equals("")) {
                double usdToNisRate = 3.65;
                double result = Double.parseDouble(amountEnteredUSD) * usdToNisRate;
                textFieldNIS.setText(String.valueOf(result));
                textFieldNIS.setStyle("-fx-text-fill: #dd9946; -fx-font-weight: bold;");
            } else if ((!amountEnteredNIS.equals("")) && amountEnteredUSD.equals("")) {
                double nisToUsdRate = 0.27;
                double result = Double.parseDouble(amountEnteredNIS) * nisToUsdRate;
                textFieldUSD.setText(String.valueOf(result));
                textFieldUSD.setStyle("-fx-text-fill: #dd9946; -fx-font-weight: bold;");
            } else if (amountEnteredUSD.equals("") && amountEnteredNIS.equals("")) {
                alert("Fill in the field");
            } else {
                clear();
                alert("You can only fill in one field");
            }
        } catch (Exception e) {
            clear();
            alert("You cannot enter text");
        }
    }

    @FXML
    private void onMouseClickedTextFieldUSD(MouseEvent event) {
        resetTextFields();
    }

    @FXML
    private void onMouseClickedTextFieldNIS(MouseEvent event) {
        resetTextFields();
    }

    private void clear() {
        textFieldUSD.setText("");
        textFieldNIS.setText("");
    }

    private void alert(String header) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(header);
        alert.setContentText("Please try again.");
        alert.showAndWait();
    }

    private void resetTextFields() {
        clear();
        textFieldUSD.setStyle("-fx-text-fill: black; -fx-font-weight: normal;");
        textFieldNIS.setStyle("-fx-text-fill: black; -fx-font-weight: normal;");
    }

}
