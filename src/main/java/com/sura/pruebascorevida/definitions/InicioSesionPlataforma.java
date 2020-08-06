package com.sura.pruebascorevida.definitions;

import com.sura.pruebascorevida.models.Credencial;
import com.sura.pruebascorevida.steps.InicioSesionGenerico;
import com.sura.pruebascorevida.utils.UtilidadCSV;
import com.sura.pruebascorevida.utils.enums.ArchivoDatoPrueba;
import com.sura.pruebascorevida.utils.enums.Plataforma;
import com.sura.pruebascorevida.utils.enums.VariableSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class InicioSesionPlataforma {

    @Steps
    InicioSesionGenerico inicioSesionGenerico;

    @Cuando("^el (.*) se encuentre autenticado en (.*)$")
    public void iniciarAutenticacion(String rol, String inicialesPlataforma) throws IOException {
        Serenity.setSessionVariable(VariableSesion.PLATAFORMA).to(inicialesPlataforma);
        Credencial crd = new Credencial(UtilidadCSV.obtenerDatosPrueba(ArchivoDatoPrueba.CREDENCIALES, rol));
        inicioSesionGenerico.iniciarSesion(Plataforma.valueOf(inicialesPlataforma), crd);
    }

    @Entonces("^se habilita el inicio de la plataforma$")
    public void validarInicioSesion() {
        inicioSesionGenerico.validarInicioSesion(Serenity.sessionVariableCalled(VariableSesion.PLATAFORMA));
    }
}
