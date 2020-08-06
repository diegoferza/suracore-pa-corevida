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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Specialty implements Serializable {

    private String code;
    private Integer id;
    private List<Link> links = null;
    private static final long serialVersionUID = -4633202762607053346L;
}