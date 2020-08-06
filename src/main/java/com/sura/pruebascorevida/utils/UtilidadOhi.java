package com.sura.pruebascorevida.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilidadOhi {
  private static final String RUTA_ARCHIVO = "src/test/resources/data/data_automatizacion.txt";

  public static void escribirIdGenerados(String id, String detalle) {
    try (FileWriter escribirId = new FileWriter(RUTA_ARCHIVO, true)) {
      escribirId.write(id + " " +  detalle + " " + obtenerFechaSistema());
      escribirId.write("\n");
    } catch (IOException e) {
      throw new IllegalStateException("No fue posible copiar texto en el archivo " + e);
    }
  }

  public static String obtenerFechaSistema(){
    return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
  }

}
