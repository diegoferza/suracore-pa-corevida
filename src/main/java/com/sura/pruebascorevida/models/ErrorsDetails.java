package com.sura.pruebascorevida.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ErrorsDetails {

    @JsonProperty ("o:errorDetails")
    ErrorDetails[] errorDetailsObject;

}
