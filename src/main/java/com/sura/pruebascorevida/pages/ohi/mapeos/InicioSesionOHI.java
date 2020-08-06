package com.sura.pruebascorevida.pages.ohi.mapeos;

import com.sura.pruebascorevida.pages.LoginPage;
import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

@Getter
public class InicioSesionOHI extends LoginPage {

    @FindBy(id = "pt0:username::content")
    private WebElementFacade txtNombreUsuario;

    @FindBy(id = "pt0:password::content")
    private WebElementFacade txtClaveUsuario;

    @FindBy(id = "pt0:loginButton")
    private WebElementFacade btnIniciarSesion;

    public InicioSesionOHI(WebDriver wdriver) {
        super(wdriver);
    }
}