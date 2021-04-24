package com.crud.personapi.utils;

import com.crud.personapi.dto.request.AddressDTO;
import com.crud.personapi.entity.Address;
import com.crud.personapi.enums.AddressType;

public class AddressUtils {

    private static final String STREET = "Rua do Sol";
    private static final String NUMBER = "123";
    private static final String COMPLEMENT = "Bloco A";
    private static final String DISTRICT = "																						";
    private static final String CITY = "Recife";
    private static final String STATE = "Pernambuco";
    private static final String COUNTRY = "Brasil";
    private static final String ZIP_CODE = "51000-000";
    private static final AddressType ADDRESS_TYPE = AddressType.HOME;
    private static final long ADDRESS_ID = 1L;

    public static AddressDTO createFakeDTO() {
        return AddressDTO.builder()
                .street(STREET)
                .number(NUMBER)
                .complement(COMPLEMENT)
                .district(DISTRICT)
                .city(CITY)
                .state(STATE)
                .country(COUNTRY)
                .zipCode(ZIP_CODE)                
                .type(ADDRESS_TYPE)
                .build();
    }

    public static Address createFakeEntity() {
        return Address.builder()
                .id(ADDRESS_ID)
                .street(STREET)
                .number(NUMBER)
                .complement(COMPLEMENT)
                .district(DISTRICT)
                .city(CITY)
                .state(STATE)
                .country(COUNTRY)
                .zipCode(ZIP_CODE)
                .type(ADDRESS_TYPE)
                .build();
    }
}
