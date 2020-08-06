package com.sura.pruebascorevida.models.ohi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LastUpdatedDate implements Serializable {

  private String value;
  private static final long serialVersionUID = 1596032134252233823L;
}