package com.crud.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EmailType {

    PERSONAL("Personal"),
    COMMERCIAL("Commercial"),
    OTHER("Other");
	
    private final String description;
}
