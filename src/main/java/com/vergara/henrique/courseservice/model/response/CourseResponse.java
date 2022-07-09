package com.vergara.henrique.courseservice.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vergara.henrique.courseservice.model.enums.CourseLevelEnum;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class CourseResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nivel")
    private CourseLevelEnum level;

    @JsonProperty("nome")
    private String name;

    @JsonProperty("descricao")
    private String description;

    @JsonProperty("preco_original")
    private Double originalPrice;

    @JsonProperty("preco_promocional")
    private Double promotionalPrice;

    @JsonProperty("porc_desconto")
    private Double percentageDiscount;

    @JsonProperty("url_imagem")
    private String imageUrl;

    @JsonProperty("modulos")
    private List<ModuleResponse> modules;
}
