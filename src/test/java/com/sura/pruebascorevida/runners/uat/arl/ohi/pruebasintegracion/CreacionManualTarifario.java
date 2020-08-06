package com.sura.pruebascorevida.runners.uat.arl.ohi.pruebasintegracion;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ohi/integrationTest/creacionManualTarifario.feature",
        glue = {"com.sura.pruebascorevida.definitions"}
)
public class CreacionManualTarifario {
}
