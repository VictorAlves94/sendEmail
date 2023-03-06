package com.ms.Email.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {
    //TODO alterando para um teste

    @NotBlank
    private String ownerRef;
    @NotBlank
    private String emailFrom;
    @NotBlank
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
