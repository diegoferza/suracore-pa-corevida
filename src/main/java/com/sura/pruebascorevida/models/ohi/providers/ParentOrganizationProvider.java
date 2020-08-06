package com.sura.pruebascorevida.models.ohi.providers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sura.pruebascorevida.models.ohi.api.FlexCodeGeneric;
import com.sura.pruebascorevida.models.ohi.api.Link;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ParentOrganizationProvider implements Serializable {

  private Integer id;
  @Setter
  private String code;
  private String idNumber;
  private String codeSAP;
  private String socialReason;
  private String flexCodeDefinitionCode;
  private String value;
  private List<Link> links = null;
  private Mipres mIPRES;
  private Regional regional;
  private TypeIdLegal typeIdLegal;
  private FlexCodeGeneric headOffice;
  private FlexCodeGeneric branchOffice;
  private List<ContactPhone> contactPhone = null;
  private static final long serialVersionUID = -4626568577005317525L;
}