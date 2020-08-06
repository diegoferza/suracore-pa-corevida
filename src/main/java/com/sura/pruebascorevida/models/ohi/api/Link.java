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
@Getter
@Setter
public class Link implements Serializable {

  private String href;
  private String rel;
  private static final long serialVersionUID = 7262772278067892708L;
}