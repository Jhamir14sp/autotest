package com.nttdata.stepsdefinitions;

import com.nttdata.steps.StoreStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class StoreStepDef {

    StoreStep store;
    WebDriver driver;

    @Given("estoy en la pagina de login de la tienda")
    public void estoyEnLaPaginaDeLoginDeLaTienda() {
        driver = getDriver();
        store = new StoreStep(driver);
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion");

    }

    @When("ingreso el correo {string}")
    public void ingresoElCorreo(String arg0) {
        store.escribeUsuario(arg0);
        screenShot();
    }

    @And("ingreso la clave {string}")
    public void ingresoLaClave(String arg0) {
    }

    @And("hago clic en Inicar Sesión")
    public void hagoClicEnInicarSesión() {
    }

    @Then("valido la pagina principal {string}")
    public void validoLaPaginaPrincipal(String arg0) {
    }
}
