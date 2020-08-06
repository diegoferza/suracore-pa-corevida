package com.sura.pruebascorevida.services.generics;

import io.restassured.response.ValidatableResponse;

public class ManejoRespuestaServicio {

    public void verificarCodigoEstadoRespuesta(ValidatableResponse response, int estado){
        try{
            response.statusCode(estado);
        }catch (AssertionError error){
            throw new AssertionError("El estado no es el esperado" + error.getMessage(),error);
        }
    }
}




