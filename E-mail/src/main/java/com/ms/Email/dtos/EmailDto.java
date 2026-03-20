package com.ms.Email.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Schema(description = "DTO para envio de email")
@Data
public class EmailDto {

    @NotBlank
    @Schema(description = "Identificador do dono do email", example = "victor-alves")
    private String ownerRef;

    @NotBlank
    @Schema(description = "Email do remetente", example = "no-reply@empresa.com")
    private String emailFrom;

    @NotBlank
    @Schema(description = "Email do destinatário", example = "cliente@email.com")
    private String emailTo;

    @NotBlank
    @Schema(description = "Assunto do email", example = "Confirmação de cadastro")
    private String subject;

    @NotBlank
    @Schema(description = "Conteúdo do email", example = "Seu cadastro foi realizado com sucesso!")
    private String text;
}
