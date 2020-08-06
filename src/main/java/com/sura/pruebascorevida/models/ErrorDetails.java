package com.sura.pruebascorevida.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ErrorDetails {

    private String title;
   @JsonProperty("o:errorCode")
    private String errorCode;
    @JsonProperty("o:errorPath")
    private String errorPath;
}
