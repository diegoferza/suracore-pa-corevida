package com.sura.pruebascorevida.steps;

import com.sura.pruebascorevida.models.Credencial;
import com.sura.pruebascorevida.pages.InicioSesionGenericoPage;
import com.sura.pruebascorevida.pages.LoginPage;
import com.sura.pruebascorevida.pages.ohi.mapeos.InicioSesionOHI;
import com.sura.pruebascorevida.pages.oipa.mapeos.InicioSesionOIPA;
import com.sura.pruebascorevida.utils.enums.Plataforma;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import waiter.Waiter;

import java.security.InvalidParameterException;

public class InicioSesionGenerico {

    @Page
    InicioSesionGenericoPage inicioSesionGenericoPage;
    @Page
    InicioSesionOHI inicioSesionOHI;
    @Page
    InicioSesionOIPA inicioSesionOIPA;
    @Page
    LoginPage loginPage;

    private EnvironmentVariables environmentVariables;
    private final Waiter waiter = new Waiter();

    @Step
    public void iniciarSesion(Plataforma plataforma, Credencial crd) {
        loginPage = obtenerPageInicioSesion(plataforma);
        waiter.get(obtenerUrlPageInicioSesion(plataforma), loginPage.getDriver());
        inicioSesionGenericoPage.loguear(loginPage, crd);
    }

    @Step
    public void validarInicioSesion(String plataforma) {
        waiter.get(loginPage.getCurrentUrl(),loginPage.getDriver());
        String currentUrl = loginPage.getCurrentUrl();
        MatcherAssert.assertThat("La URL abierta No es la esperada.", currentUrl.equalsIgnoreCase(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(plataforma.toLowerCase() + "home.page")));
    }

    private LoginPage obtenerPageInicioSesion(Plataforma plataforma) {
        switch (plataforma) {
            case OHI:
                return inicioSesionOHI;
            case OIPA:
                return inicioSesionOIPA;
            default:
                throw new InvalidParameterException("Plataforma no soportada");
        }
    }

    private String obtenerUrlPageInicioSesion(Plataforma plataforma) {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(plataforma.toString().toLowerCase() + "signin.page");
    }
}
