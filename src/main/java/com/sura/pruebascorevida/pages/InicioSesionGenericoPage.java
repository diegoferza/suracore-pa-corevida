package com.sura.pruebascorevida.pages;

import com.sura.pruebascorevida.models.Credencial;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import waiter.Waiter;

@Slf4j
public class InicioSesionGenericoPage extends PageObject {

    private final Waiter waiter = new Waiter();
    public InicioSesionGenericoPage(WebDriver driver) {
        super(driver);
    }

    public void loguear(LoginPage loginPage, Credencial crd) {
        try {
            loginPage.getTxtNombreUsuario().waitUntilVisible().waitUntilEnabled().typeAndTab(crd.getUsuario());
            loginPage.getTxtClaveUsuario().waitUntilVisible().waitUntilEnabled().typeAndTab(crd.getContrasenia());
            waiter.clickElementAndWaitForPageLoadComplete(loginPage.getBtnIniciarSesion(),super.getDriver());
        } catch (Exception e) {
            log.error("Error al interactuar con los campos relacionados con el login.", e);
        }
    }
}