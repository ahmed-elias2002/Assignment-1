/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed Elias
 */
public class CurrencyConversionPage extends Stage {

    public CurrencyConversionPage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/SystemPage.fxml"));
        Parent root = loader.load();
        this.setResizable(false);
        this.setTitle("Currency Change System");
        this.setScene(new Scene(root));
    }

}
