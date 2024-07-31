package com.nttdata.steps;

import com.nttdata.page.StorePage;
import org.openqa.selenium.WebDriver;

public class StoreStep {

    WebDriver driver;
    StorePage store;

    public StoreStep(WebDriver driver) {
        this.driver = driver;
    }

    public void escribeUsuario(String usuario){
        store = new StorePage(driver);
       store.escribirUsuario(usuario);
    }
}
