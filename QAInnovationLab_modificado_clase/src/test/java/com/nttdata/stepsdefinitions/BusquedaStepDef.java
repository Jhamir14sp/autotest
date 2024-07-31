package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MercadoLibreStep;
import io.cucumber.java.en.And;

import static com.nttdata.core.DriverManager.getDriver;

public class BusquedaStepDef {

    MercadoLibreStep mercadol;


    @And("agrego un producto al carrito compra")
    public void agregoUnProductoAlCarritoCompra() throws InterruptedException {

        mercadol = new MercadoLibreStep(getDriver());
        mercadol.buscarProducto("aaa");
    }
}
