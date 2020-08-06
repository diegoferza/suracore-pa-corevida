package com.sura.pruebascorevida.models.ohi.grupoprestaciones;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sura.pruebascorevida.models.ohi.api.CreationDate;
import com.sura.pruebascorevida.models.ohi.api.LastUpdatedDate;
import com.sura.pruebascorevida.models.ohi.api.Link;
import lombok.*;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaestroGrupoPrestaciones implements Serializable {

    private Integer id;
    private Integer createdBy;
    private Integer lastUpdatedBy;
    private Integer objectVersionNumber;
    private String uuid;
    private String code;
    private String descr;
    private List<Link> links = null;
    private CreationDate creationDate;
    private LastUpdatedDate lastUpdatedDate;
    private static final long serialVersionUID = 1L;

    public MaestroGrupoPrestaciones(String codigoGrupoPrestacion, String descripcionGrupoPrestacion) {
        this.code = codigoGrupoPrestacion;
        this.descr = descripcionGrupoPrestacion;
    }

    public MaestroGrupoPrestaciones(String codigoGrupoPrestacion) {
        this.code = codigoGrupoPrestacion;
    }
}