package com.sura.pruebascorevida.models.ohi.grupoprestaciones;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sura.pruebascorevida.models.ohi.api.Link;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Procedure implements Serializable
{
    private Integer id;
    private String code;
    private String flexCodeDefinitionCode;
    private String value;
    private List<Link> links = null;

    public Procedure(String codigoPrestacion, String definicionPrestacion) {
        this.code = codigoPrestacion;
        this.flexCodeDefinitionCode = definicionPrestacion;
    }
}