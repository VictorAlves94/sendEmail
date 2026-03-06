📧 SendEmail - Microserviço de Envio de Email com Spring Boot

Este projeto é um microserviço de envio de emails desenvolvido com Spring Boot.
Ele expõe uma API REST que recebe os dados do email e realiza o envio utilizando SMTP do Gmail.

O objetivo do projeto é demonstrar a implementação de um serviço simples de envio de emails seguindo boas práticas com Spring Boot, JPA, DTOs e validação.

🚀 Tecnologias utilizadas

Java

Spring Boot

Spring Web

Spring Data JPA

Spring Mail

H2 Database

Lombok

Jakarta Validation

Maven

📂 Estrutura do Projeto
src/main/java/com/ms/Email
│
├── controllers
│   └── EmailController.java
│
├── dtos
│   └── EmailDto.java
│
├── entity
│   └── EmailEntity.java
│
├── enums
│   └── StatusEmail.java
│
├── repositories
│   └── EmailRepository.java
│
├── services
│   └── EmailService.java
│
└── EmailApplication.java
⚙️ Configuração

As configurações estão no arquivo:

src/main/resources/application.properties
Banco de dados H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

Console do banco:

http://localhost:8080/h2-console
Configuração de Email (SMTP Gmail)
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=SEU_EMAIL
spring.mail.password=SUA_SENHA_DE_APP
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

⚠️ Importante:
Utilize senha de aplicativo do Gmail, não a senha da conta.

📡 Endpoint da API
Enviar Email
POST /send-email
Body (JSON)
{
  "ownerRef": "Victor",
  "emailFrom": "seuemail@gmail.com",
  "emailTo": "destino@gmail.com",
  "subject": "Teste de Email",
  "text": "Este é um email enviado pelo microserviço."
}
Resposta
HTTP 201 - Created

Retorna o objeto do email com o status do envio.

📊 Status do Email

O envio pode retornar dois status:

SEND
ERROR

Eles são definidos no enum:

StatusEmail.java
🧪 Testando a API

Você pode testar usando:

Postman

Insomnia

cURL

Exemplo com cURL:

curl -X POST http://localhost:8080/send-email \
-H "Content-Type: application/json" \
-d '{
 "ownerRef":"Victor",
 "emailFrom":"seuemail@gmail.com",
 "emailTo":"destino@gmail.com",
 "subject":"Teste",
 "text":"Mensagem de teste"
}'
▶️ Como rodar o projeto

1️⃣ Clone o repositório

git clone https://github.com/VictorAlves94/sendEmail.git

2️⃣ Entre na pasta

cd sendEmail

3️⃣ Execute o projeto

./mvnw spring-boot:run

ou

mvn spring-boot:run
💡 Objetivo do Projeto

Este projeto foi desenvolvido para:

Aprender arquitetura de microserviços

Implementar envio de emails via API

Praticar Spring Boot + JPA + DTO

Trabalhar com validação de dados
