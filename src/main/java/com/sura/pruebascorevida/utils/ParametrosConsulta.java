package com.sura.pruebascorevida.utils;

import java.util.HashMap;
import java.util.Map;

public class ParametrosConsulta {

  public static final String EQ = ".eq";
  public static final String LIKE = ".like";
  public static final String AND = ".and.";
  public static final String QUERY = "q";
  public final StringBuilder parametroCompleto;

  public ParametrosConsulta() {
    this.parametroCompleto = new StringBuilder();
  }

  public Map<String, String> contruirConsulta() {
    Map<String, String> parametro = new HashMap<>();
    parametro.put(QUERY, parametroCompleto.toString());
    return parametro;
  }

  public ParametrosConsulta consultarEquivalencia(String campo, String valor) {
      if (!parametroCompleto.toString().isEmpty()) {
          parametroCompleto.append(AND);
      }
    parametroCompleto.append(campo)
        .append(EQ).append("('").append(valor).append("')");
    return this;
  }

  public ParametrosConsulta autocompletarValores(String campo, String valor) {
      if (!parametroCompleto.toString().isEmpty()) {
          parametroCompleto.append(AND);
      }
    parametroCompleto.append(campo)
        .append(LIKE).append("('%").append(valor).append("%')");
    return this;
  }
}