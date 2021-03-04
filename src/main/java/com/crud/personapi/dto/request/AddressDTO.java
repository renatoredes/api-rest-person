package com.crud.personapi.dto.request;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.crud.personapi.enums.AddressType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author Felipe
 * EmailDTO representa os objetos de entradas 
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
public class AddressDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private AddressType type;
    
    @NotEmpty
    @Size(min = 2, max = 250)
    private String street;
    
    @NotEmpty
    @Size(min = 1, max = 10)
    private String number;
    
    @Size(min = 0, max = 250)
    private String complement;
    
    @NotEmpty
    @Size(min = 2, max = 250)
    private String district;
    
    @NotEmpty
    @Size(min = 2, max = 250)
    private String city;
    
    @NotEmpty
    @Size(min = 2, max = 250)
    private String state;
    
    @NotEmpty
    @Size(min = 2, max = 250)
    private String country;
    
    @NotEmpty
    @Size(min = 2, max = 250)
    private String zipCode;
}
