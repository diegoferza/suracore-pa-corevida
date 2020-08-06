package com.sura.pruebascorevida.models.ohi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FlexCodeGeneric implements Serializable {

  private String flexCodeDefinitionCode;
  private String descriptor;
  private String value;
  private List<Link> links = null;
  private static final long serialVersionUID = 1L;

  public FlexCodeGeneric(String tipoSede) {
    this.flexCodeDefinitionCode = tipoSede;
  }
}