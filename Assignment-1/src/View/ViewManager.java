/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;

/**
 *
 * @author Ahmed Elias
 */
public class ViewManager {

    private static LoginPage loginPage;
    private static CurrencyConversionPage currencyConversionPage;

    private ViewManager() {
    }

    public static void openLoginPage() throws IOException {
        if (loginPage == null) {
            loginPage = new LoginPage();
            loginPage.show();
        } else {
            loginPage.show();
        }
    }

    public static void closeLoginPage() {
        if (loginPage != null) {
            loginPage.close();
        }
    }

    public static void openCurrencyConversionPage() throws IOException {
        if (currencyConversionPage == null) {
            currencyConversionPage = new CurrencyConversionPage();
            currencyConversionPage.show();
        } else {
            currencyConversionPage.show();
        }
    }

    public static void closeCurrencyConversionPage() {
        if (currencyConversionPage != null) {
            currencyConversionPage.close();
        }
    }

}
