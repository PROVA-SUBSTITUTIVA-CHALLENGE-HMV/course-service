package com.vergara.henrique.courseservice.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vergara.henrique.courseservice.model.enums.CourseLevelEnum;
import lombok.Data;

import java.util.List;

@Data
public class CreateCourseRequest {

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
    private List<CreateModuleRequest> modules;
}