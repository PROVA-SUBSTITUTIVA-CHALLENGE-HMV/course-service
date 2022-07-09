package com.vergara.henrique.courseservice.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_module")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Module implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "nm_modulo")
  private String name;

  @Column(name = "carga_horaria")
  private String workload;

  @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
  private List<Content> contents;
}
