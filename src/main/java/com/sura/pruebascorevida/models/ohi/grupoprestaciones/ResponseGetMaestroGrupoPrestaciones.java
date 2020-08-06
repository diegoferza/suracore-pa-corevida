package com.sura.pruebascorevida.models.ohi.grupoprestaciones;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseGetMaestroGrupoPrestaciones implements Serializable
{
    private List<MaestroGrupoPrestaciones> maestroGrupoPrestaciones;
    private static final long serialVersionUID = 8704558352046608100L;
}