package com.ms.Email.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Status do envio de email")
public enum StatusEmail {
    @Schema(description = "Email enviado com sucesso")
    SEND,
    @Schema(description = "Erro ao enviar email")
    ERROR;
}
