package com.crud.personapi.utils;

import com.crud.personapi.dto.request.EmailDTO;
import com.crud.personapi.entity.Email;
import com.crud.personapi.enums.EmailType;

public class EmailUtils {

    private static final String EMAIL_CONTACT = "me@email.com";
    private static final EmailType EMAIL_TYPE = EmailType.PERSONAL;
    private static final long EMAIL_ID = 1L;

    public static EmailDTO createFakeDTO() {
        return EmailDTO.builder()
                .contact(EMAIL_CONTACT)
                .type(EMAIL_TYPE)
                .build();
    }

    public static Email createFakeEntity() {
        return Email.builder()
                .id(EMAIL_ID)
                .contact(EMAIL_CONTACT)
                .type(EMAIL_TYPE)
                .build();
    }
}
