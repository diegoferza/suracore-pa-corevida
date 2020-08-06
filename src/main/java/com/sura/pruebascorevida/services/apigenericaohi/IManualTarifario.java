package com.sura.pruebascorevida.services.apigenericaohi;

import com.sura.pruebascorevida.models.ManualTarifario;
import io.cucumber.datatable.DataTable;

import java.io.IOException;

public interface IManualTarifario {
    public ManualTarifario crear (String filtroCSV) throws IOException;
    public ManualTarifario crear (DataTable datosTabla);
    public ManualTarifario crear (String codigo, String descripcion, String moneda, String tipo);
}
