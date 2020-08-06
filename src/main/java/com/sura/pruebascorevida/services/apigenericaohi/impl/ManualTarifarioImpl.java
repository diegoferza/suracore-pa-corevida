package com.sura.pruebascorevida.services.apigenericaohi.impl;

import com.sura.pruebascorevida.models.Currency;
import com.sura.pruebascorevida.models.FeeScheduleType;
import com.sura.pruebascorevida.models.ManualTarifario;
import com.sura.pruebascorevida.services.apigenericaohi.IManualTarifario;
import com.sura.pruebascorevida.utils.UtilidadCSV;
import com.sura.pruebascorevida.utils.enums.ArchivoDatoPrueba;
import io.cucumber.datatable.DataTable;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ManualTarifarioImpl implements IManualTarifario {

    @Override
    public ManualTarifario crear(String filtroCSV) throws IOException {
        List<Map<String, String>> datos = UtilidadCSV.obtenerDatosPrueba(ArchivoDatoPrueba.MANUALTARIFARIO,filtroCSV);
        Currency currencyTest = new Currency(datos.get(0).get("moneda"));
        FeeScheduleType feeScheduleTypeTest = new FeeScheduleType(datos.get(0).get("tipo"));
        return new ManualTarifario(datos.get(0).get("codigo"),datos.get(0).get("descripcion"),currencyTest,feeScheduleTypeTest);
    }

    @Override
    public ManualTarifario crear (DataTable datosTabla){
        List<Map<String, String>> datosPrueba = datosTabla.asMaps(String.class,String.class);
        Currency currencyTest = new Currency(datosPrueba.get(0).get("moneda"));
        FeeScheduleType feeScheduleTypeTest = new FeeScheduleType(datosPrueba.get(0).get("tipo"));
        return new ManualTarifario(datosPrueba.get(0).get("codigo"),datosPrueba.get(0).get("descripcion"),currencyTest,feeScheduleTypeTest);
    }

    @Override
    public ManualTarifario crear (String codigo, String descripcion, String moneda, String tipo){
        Currency currencyTest = new Currency(moneda);
        FeeScheduleType feeScheduleTypeTest = new FeeScheduleType(tipo);
        return new ManualTarifario(codigo,descripcion,currencyTest,feeScheduleTypeTest);
    }
}

