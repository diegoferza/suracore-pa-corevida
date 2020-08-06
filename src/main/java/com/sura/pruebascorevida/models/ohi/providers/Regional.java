package com.sura.pruebascorevida.models.ohi.providers;

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
public class Regional implements Serializable {

  private Integer id;
  private String regional;
  private static final long serialVersionUID = 5111458788865055127L;
}