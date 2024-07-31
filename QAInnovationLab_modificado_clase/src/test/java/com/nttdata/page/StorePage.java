package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StorePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By campoUsuario = By.id("field-email");

    public StorePage(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //espera Explicita
    }

    public void escribirUsuario(String txtUsuario) {

        wait.until(ExpectedConditions.presenceOfElementLocated(campoUsuario));
        wait.until(ExpectedConditions.visibilityOfElementLocated(campoUsuario));
        wait.until(ExpectedConditions.elementToBeClickable(campoUsuario));
        WebElement usuario = driver.findElement(campoUsuario);
        usuario.sendKeys(txtUsuario);

    }
}
