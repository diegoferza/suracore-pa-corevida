package com.sura.pruebascorevida.utils.enums;

import lombok.Getter;

@Getter
public enum NombreAPI {

    APIGENERICAOHI("genericaohi");

    private final String api;

    NombreAPI(String api) {
        this.api = api;
    }

}
