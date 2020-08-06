package com.sura.pruebascorevida.models.ohi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FlexCodeSystem implements Serializable {

    private Integer id;
    private List<Link> links = null;
    private static final long serialVersionUID = -2120435892411207303L;
}