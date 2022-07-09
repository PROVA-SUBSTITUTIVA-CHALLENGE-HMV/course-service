package com.vergara.henrique.courseservice.model.entity;

import com.vergara.henrique.courseservice.model.enums.CourseLevelEnum;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_course")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "nivel")
    private CourseLevelEnum level;

    @Column(name = "nm_curso")
    private String name;

    @Column(name = "ds_curso")
    private String description;

    @Column(name = "preco_original")
    private Double originalPrice;

    @Column(name = "preco_promocional")
    private Double promotionalPrice;

    @Column(name = "porc_desconto")
    private Double percentageDiscount;

    @Column(name = "url_imagem")
    private String imageUrl;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private List<Module> modules;

}
