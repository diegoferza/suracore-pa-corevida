package com.sura.pruebascorevida.models.ohi.providers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sura.pruebascorevida.models.ohi.api.CreationDate;
import com.sura.pruebascorevida.models.ohi.api.FlexCodeGeneric;
import com.sura.pruebascorevida.models.ohi.api.FlexCodeSystem;
import com.sura.pruebascorevida.models.ohi.api.LastUpdatedDate;
import com.sura.pruebascorevida.models.ohi.api.Link;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InformacionProveedor implements Serializable {


    private Integer id;
    private String idNumber;
    private String codeSAP;
    private String socialReason;
    private String flexCodeDefinitionCode;
    private String value;
    private String code;
    private Integer createdBy;
    private String emailAddress1;
    private String firstName;
    private String secondName;
    private String gender;
    private Integer lastUpdatedBy;
    private String middleName;
    private String name;
    private Integer objectLastUpdatedBy;
    private Integer objectVersionNumber;
    private String startDate;
    private String subtype;
    private String uuid;
    private List<Link> links = null;
    private TypeIdNatural typeIdNatural;
    private FlexCodeGeneric headOffice;
    private FlexCodeGeneric branchOffice;
    private List<ContactPhone> contactPhone = null;
    private CreationDate creationDate;
    private LastUpdatedDate lastUpdatedDate;
    private ObjectLastUpdatedDate objectLastUpdatedDate;
    private FlexCodeSystem flexCodeSystem;
    private FunctionDynamicLogic functionDynamicLogic;
    private Language language;
    private Prefix prefix;
    private List<ProviderSpecialtyList> providerSpecialtyList = null;
    private ParentOrganizationProvider parentOrganizationProvider;
    private TypeIdLegal typeIdLegal;
    private static final long serialVersionUID = 5302918295880755563L;

}