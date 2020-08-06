package com.sura.pruebascorevida.definitions;

import com.sura.pruebascorevida.models.Credencial;
import com.sura.pruebascorevida.utils.Utilidad;
import com.sura.pruebascorevida.utils.UtilidadCSV;
import cucumber.api.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import net.serenitybdd.rest.SerenityRest;
import java.io.IOException;

import static com.sura.pruebascorevida.utils.enums.ArchivoDatoPrueba.CREDENCIALES;
import static com.sura.pruebascorevida.utils.enums.Filtros.USUARIO_API_OHI;
import static com.sura.pruebascorevida.utils.enums.NombreAPI.APIGENERICAOHI;
import static net.serenitybdd.rest.SerenityRest.preemptive;

public class SetupStory {

  @Before("@ApiGenericOHI")
  public  void generarURL() throws IOException {
    Credencial credencial = new Credencial(
            UtilidadCSV.obtenerDatosPrueba(CREDENCIALES,
                    USUARIO_API_OHI.getCredenciales()));
    SerenityRest.setDefaultRequestSpecification(new RequestSpecBuilder()
    .setBaseUri(Utilidad.obtenerUriBase(APIGENERICAOHI.getApi()))
    .setAuth(preemptive().basic(credencial.getUsuario(), credencial.getContrasenia()))
    .build());
  }
}