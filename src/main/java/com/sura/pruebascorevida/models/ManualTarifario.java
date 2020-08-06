package com.sura.pruebascorevida.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManualTarifario {
    private String code;
    private String descr;
    private Currency currency = new Currency();
    private FeeScheduleType feeScheduleType = new FeeScheduleType();
}