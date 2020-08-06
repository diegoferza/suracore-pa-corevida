package com.sura.pruebascorevida.pages.oipa.mapeos;

import com.sura.pruebascorevida.pages.LoginPage;
import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

@Getter
public class InicioSesionOIPA extends LoginPage {

    @FindBy(id = "userName")
    private WebElementFacade txtNombreUsuario;

    @FindBy(id = "password")
    private WebElementFacade txtClaveUsuario;

    @FindBy(id = "submit")
    private WebElementFacade btnIniciarSesion;

    public InicioSesionOIPA(WebDriver wdriver) {
        super(wdriver);
    }
}
