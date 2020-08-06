package com.sura.pruebascorevida.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public abstract class LoginPage extends GeneralPage {

    public LoginPage(WebDriver wdriver) {
        super(wdriver);
    }

    public abstract WebElementFacade getTxtNombreUsuario();

    public abstract WebElementFacade getTxtClaveUsuario();

    public abstract WebElementFacade getBtnIniciarSesion();
}