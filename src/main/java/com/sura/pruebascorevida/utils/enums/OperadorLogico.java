package com.sura.pruebascorevida.utils.enums;

public enum OperadorLogico {
    MAYOR("mayor"),
    MENOR("menor"),
    IGUAL("igual");

    private final String valor;

    private OperadorLogico(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
