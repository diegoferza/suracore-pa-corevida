package com.sura.pruebascorevida.runners.uat.arl;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/inicioSesionPlataforma.feature",
        glue = {"com.sura.pruebascorevida.definitions"}
)
public class InicioSesionGenericoPlataforma {

}
