package com.crud.personapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.crud.personapi.dto.request.PersonDTO;
import com.crud.personapi.entity.Person;

/**
 * @author Renato interface PersonMapper é responsável por : realizar uma conversão de um objeto de uma
 *         entidade para um DTO e de um DTO para uma entidade.
 *         target indica o atributo alvo que quero converter a data para dia mes e ano
 */
@Mapper
public interface PersonMapper {

	PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

	@Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
	Person toModel(PersonDTO personDTO);

	PersonDTO toDTO(Person person);
}
