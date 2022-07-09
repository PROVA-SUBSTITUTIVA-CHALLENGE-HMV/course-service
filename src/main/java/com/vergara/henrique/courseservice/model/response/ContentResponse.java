package com.vergara.henrique.courseservice.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ContentResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("descricao")
    private String description;
}
