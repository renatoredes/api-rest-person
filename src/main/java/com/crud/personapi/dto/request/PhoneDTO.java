package com.crud.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.crud.personapi.enums.PhoneType;

/***
 * 
 * @author Renato
 * PhoneDTO representa os objetos de entradas 
 * 
 * @Data responsavel por gerar os get/set
 * @Builder responsavel por uma contrução de objetos utilizando padrão
 * @AllArgsConstructor e @NoArgsConstructor responsavel por inserir os contrutores
 *  
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
