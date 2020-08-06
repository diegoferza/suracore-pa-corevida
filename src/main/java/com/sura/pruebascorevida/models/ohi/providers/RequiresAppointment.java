package com.sura.pruebascorevida.models.ohi.providers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sura.pruebascorevida.models.ohi.api.Link;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequiresAppointment implements Serializable {

  private String flexCodeDefinitionCode;
  private String descriptor;
  private String value;
  private List<Link> links = null;
  private static final long serialVersionUID = -6283419246407229010L;
}