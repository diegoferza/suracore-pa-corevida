package com.sura.pruebascorevida.utils;

import com.sura.pruebascorevida.utils.enums.ArchivoDatoPrueba;
import com.sura.pruebascorevida.utils.enums.Separador;
import net.thucydides.core.steps.stepdata.CSVTestDataSource;
import net.thucydides.core.steps.stepdata.TestDataSource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public final class UtilidadCSV {

    private static final String RUTA_RECURSOS_DATOS_CSV = "data/";
    private static final String EXTENSION_NOMBRE_DATOS_CSV = ".csv";
    private static final String NOMBRE_COLUMNA_FILTRO = "idFiltro";
    private static final char SEPARADOR_VALORES_CSV = ';';

    private UtilidadCSV() {
    }

    public static List<Map<String, String>> obtenerDatosPrueba(ArchivoDatoPrueba nombreCSV, String filtro)
            throws IOException {
        TestDataSource datosOrigenCSV =
                new CSVTestDataSource(RUTA_RECURSOS_DATOS_CSV+ nombreCSV.toString().toLowerCase()+ EXTENSION_NOMBRE_DATOS_CSV,SEPARADOR_VALORES_CSV);
        return obtenerDatosFiltrados(datosOrigenCSV, filtro);
    }

    private static List<Map<String, String>> obtenerDatosFiltrados(
            TestDataSource datosCSV, String cadenaListadoFiltros) {
        List<Map<String, String>> lstTotalDatosCSV = datosCSV.getData();
        if ("".equals(cadenaListadoFiltros)) {
            return lstTotalDatosCSV;
        }
        String[] arrListadoFiltros =
                cadenaListadoFiltros.split(Separador.COMA.getValor());
        return filtrarDatos(arrListadoFiltros, lstTotalDatosCSV);
    }

    private static List<Map<String, String>> filtrarDatos(
            String[] arrListaFiltros, List<Map<String, String>> listaTotalDatos) {
        return listaTotalDatos
                .stream()
                .filter(fila -> Utilidad.compararDatosLista(arrListaFiltros, fila.get(NOMBRE_COLUMNA_FILTRO)))
                .collect(Collectors.toList());
    }

    public static String obtenerDatoContenidoCSV(
        ArchivoDatoPrueba nomDiccionarioCSV,
            String nombreColumnaPivote,
            String valorColumnaPivote,
            String nombreColumnaRetornar)
            throws IOException {
        List<Map<String, String>> lstDiccionario =
                obtenerDatosPrueba(nomDiccionarioCSV, valorColumnaPivote);
        Optional<String> valorObtenido =
                lstDiccionario
                        .stream()
                        .filter(registro -> valorColumnaPivote.equals(registro.get(nombreColumnaPivote)))
                        .map(registro -> registro.get(nombreColumnaRetornar))
                        .findFirst();
        if (valorObtenido.isPresent()) {
            return valorObtenido.get();
        }
        throw new IllegalArgumentException(
                String.format("Columna %s NO encontrada", nombreColumnaRetornar));
    }
}
