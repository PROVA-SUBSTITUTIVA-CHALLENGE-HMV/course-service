package com.vergara.henrique.courseservice.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CreateModuleRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("nome")
    private String name;

    @JsonProperty("carga_horaria")
    private String workload;

    @JsonProperty("conteudos")
    private List<CreateContentRequest> contents;
}
