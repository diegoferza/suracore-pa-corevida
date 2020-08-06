package com.sura.pruebascorevida.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Credencial {
  private String usuario;
  private String contrasenia;

  public Credencial(List<Map<String, String>> datosCredenciales) {
    if (datosCredenciales != null) {
      this.usuario = datosCredenciales.get(0).get("usuario");
      this.contrasenia = datosCredenciales.get(0).get("contrasenia");
    }
  }
}
