package com.sura.pruebascorevida.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RecursoServicio {
    MANUALTARIFARIO("feeschedules"),
    PROVEEDOR_JURIDICO ("organizationproviders"),
    PROVEEDOR_NATURAL ("individualproviders"),
    GRUPO_PRESTACIONES ("proceduregroups"),
    DETALLE_GRUPO_PRESTACIONES("proceduregroupdetails");
    private final String recurso;

}