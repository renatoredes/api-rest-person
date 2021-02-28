package com.crud.personapi.dto.response;

import lombok.Builder;
import lombok.Data;

/***
 * 
 * @author Renato
 * MessageResponseDTO representa os objetos de saida 
 * 
 * @Data responsavel por gerar os get/set
 * @Builder responsavel por uma contrução de objetos utilizando padrão
 * 
 */
@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
