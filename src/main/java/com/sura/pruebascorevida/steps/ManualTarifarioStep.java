package com.sura.pruebascorevida.steps;

import com.sura.pruebascorevida.models.ErrorsDetails;
import com.sura.pruebascorevida.models.ManualTarifario;
import com.sura.pruebascorevida.services.apigenericaohi.IManualTarifario;
import com.sura.pruebascorevida.services.apigenericaohi.impl.ManualTarifarioImpl;
import com.sura.pruebascorevida.services.generics.ClienteConsumoServicio;
import com.sura.pruebascorevida.services.generics.ManejoRespuestaServicio;
import io.restassured.http.Method;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;

import static com.sura.pruebascorevida.utils.enums.RecursoServicio.MANUALTARIFARIO;
import static org.hamcrest.core.IsEqual.equalTo;

public class ManualTarifarioStep {

private ValidatableResponse crearManualTarifarioResponse;
private final IManualTarifario operacionManualTarifario = new ManualTarifarioImpl();
private final ManejoRespuestaServicio validacionRespuestaServicio = new ManejoRespuestaServicio();

    @Step
    public void crearManualTarifario(String codigoConvenio, String descripcion, String moneda, String tipoUnidad) {
        ClienteConsumoServicio clienteConsumoServicio = new ClienteConsumoServicio();
        ManualTarifario manualTarifario = operacionManualTarifario.crear(codigoConvenio,descripcion,moneda,tipoUnidad);
        crearManualTarifarioResponse = clienteConsumoServicio.ejecutarConsumoCuerpo(Method.POST,
            MANUALTARIFARIO.getRecurso(), manualTarifario);
    }

    @Step
    public void validarCodigoRespuestaManualTarifario(int estadoEsperado) {
        validacionRespuestaServicio.verificarCodigoEstadoRespuesta(crearManualTarifarioResponse,estadoEsperado);
    }

    @Step
    public void verificarMensajeManualTariafarioExistente(String mensaje){
        ErrorsDetails respuestaManualtarifarioErrores = crearManualTarifarioResponse.extract().body().as(ErrorsDetails.class);
        MatcherAssert.
                assertThat(respuestaManualtarifarioErrores.getErrorDetailsObject()[0].getTitle(),equalTo(mensaje));
    }
}