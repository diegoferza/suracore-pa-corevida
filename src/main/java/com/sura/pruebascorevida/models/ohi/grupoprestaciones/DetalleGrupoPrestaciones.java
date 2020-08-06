package com.sura.pruebascorevida.models.ohi.grupoprestaciones;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sura.pruebascorevida.models.ohi.api.CreationDate;
import com.sura.pruebascorevida.models.ohi.api.LastUpdatedDate;
import com.sura.pruebascorevida.models.ohi.api.Link;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleGrupoPrestaciones
{
    private Integer id;
    private Integer createdBy;
    private Integer lastUpdatedBy;
    private Integer objectVersionNumber;
    private String startDate;
    private String uuid;
    private List<Link> links = null;
    private CreationDate creationDate;
    private LastUpdatedDate lastUpdatedDate;
    private Procedure procedure;
    private MaestroGrupoPrestaciones procedureGroup;

    public DetalleGrupoPrestaciones(String fechaInicio, Procedure procedure, MaestroGrupoPrestaciones maestroGrupoPrestaciones) {
        this.startDate = fechaInicio;
        this.procedure = procedure;
        this.procedureGroup = maestroGrupoPrestaciones;
    }
}