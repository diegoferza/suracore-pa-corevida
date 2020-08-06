package com.sura.pruebascorevida.models.ohi.providers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sura.pruebascorevida.models.ohi.api.FlexCodeGeneric;
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
public class Mipres implements Serializable
{

    private Integer id;
    private FlexCodeGeneric accept;
    private FlexCodeGeneric inductor;
    private static final long serialVersionUID = -9021928448851227766L;
}