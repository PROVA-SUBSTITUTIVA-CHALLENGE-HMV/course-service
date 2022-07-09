package com.vergara.henrique.courseservice.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class ModuleResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("nome")
    private String name;

    @JsonProperty("carga_horaria")
    private String workload;

    @JsonProperty("conteudos")
    private List<ContentResponse> contents;
}