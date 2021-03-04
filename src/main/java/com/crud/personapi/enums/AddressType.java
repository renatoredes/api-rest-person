package com.crud.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AddressType {

    HOME("Home"),
    WORK("Work"),
    COMMERCIAL("Commercial"),
    OTHER("Other");
	
    private final String description;
}
