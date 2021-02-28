package com.crud.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.crud.personapi.enums.PhoneType;

/***
 * 
 * @author Renato
 * @Entity Phone representa uma entidade no banco de dados
 * @Data responsavel por gerar os get/set
 * @Builder responsavel por uma contrução de objetos utilizando padrão
 * @AllArgsConstructor e @NoArgsConstructor responsavel por inserir os contrutores
 *  
 * 
 */

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;


}
