package com.vergara.henrique.courseservice.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class CreateContentRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("descricao")
    private String description;
}
