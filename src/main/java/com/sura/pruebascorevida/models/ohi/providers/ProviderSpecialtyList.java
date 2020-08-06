package com.sura.pruebascorevida.models.ohi.providers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sura.pruebascorevida.models.ohi.api.CreationDate;
import com.sura.pruebascorevida.models.ohi.api.LastUpdatedDate;
import com.sura.pruebascorevida.models.ohi.api.Link;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProviderSpecialtyList implements Serializable {

  private Integer id;
  private Integer createdBy;
  private Integer lastUpdatedBy;
  private Integer objectVersionNumber;
  private String startDate;
  private String uuid;
  private List<Link> links = null;
  private RequiresAppointment requiresAppointment;
  private Ivr ivr;
  private PublishDirectory publishDirectory;
  private CreationDate creationDate;
  private LastUpdatedDate lastUpdatedDate;
  private Specialty specialty;
  private static final long serialVersionUID = 601695579004787307L;

}