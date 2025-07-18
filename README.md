# 📢 Ouvidoria Digital - Backend

Este é o back-end do sistema de gerenciamento de reclamações **Ouvidoria Digital**, desenvolvido em **Spring Boot**. Ele permite que usuários autentiquem-se de forma segura, registrem suas reclamações e as consultem posteriormente.

## 🚀 Tecnologias utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Security + JWT**
- **Spring Data JPA**
- **Hibernate**
- **Banco de Dados PostgreSQL**
- **Lombok**
- **Maven**

##   Configurações do Banco de Dados

A aplicação depende de um banco PostgreeSQL com as seguintes credenciais:

Banco: ouvidoria_digital
Usuário: mclairex
Senha: mcsoliveira
Porta: 5432

URL JDBC: jdbc:postgresql://localhost:5432/ouvidoria_digital


## 🔐 Autenticação

O sistema utiliza **JWT (JSON Web Token)** para autenticação e autorização.

### Pré-requisitos

- Java 17
- Maven
- PostgreSQL (ou outro DB compatível)
- Variáveis de ambiente com configurações do WebGate
