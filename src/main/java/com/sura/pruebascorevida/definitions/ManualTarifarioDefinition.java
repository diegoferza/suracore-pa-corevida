package com.sura.pruebascorevida.definitions;

import com.sura.pruebascorevida.steps.ManualTarifarioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

import static org.apache.http.HttpStatus.SC_UNPROCESSABLE_ENTITY;

public class ManualTarifarioDefinition {

    @Steps
    ManualTarifarioStep manualTarifarioStep;

    @Cuando("se solicite la creación de un manual tarifario existente con con un codigo de convenio {string}, una descripcion {string}, moneda {string} y un tipo de unidad {string}")
    public void solicitarCreacionManualTarifarioExistente(String codigoConvenio,String descripcion, String moneda, String tipoUnidad) throws IOException {
        manualTarifarioStep.crearManualTarifario(codigoConvenio,descripcion, moneda,tipoUnidad);
    }

    @Entonces("no es posible llevar a cabo la creación del manual y se le informa al usuario {string}")
    public void validarNoCreacionManualTarifarioExistente(String mensajeConvenioExistente) {
        manualTarifarioStep.validarCodigoRespuestaManualTarifario(SC_UNPROCESSABLE_ENTITY);
        manualTarifarioStep.verificarMensajeManualTariafarioExistente(mensajeConvenioExistente);
    }
}



