# 🏃‍♂️ Players API

API REST de estudo desenvolvida com **Spring Boot** e **PostgreSQL**, utilizando **Docker** para orquestração. Atualmente permite listar, buscar, criar e deletar jogadores fictícios.

## 🧰 Tecnologias

- Java 17
- Spring Boot
- PostgreSQL
- Docker / Docker Compose
- Gradle

## 🚀 Como rodar o projeto

### Pré-requisitos

- Docker e Docker Compose instalados

### Passos para subir a aplicação

```bash
# 1. Clone o projeto (caso não tenha feito)
git clone <URL_DO_REPOSITORIO>

# 2. Acesse a pasta do projeto
cd players

# 3. Suba os containers (app + banco)
docker-compose up --build
```

A API estará disponível em:  
📍 `http://localhost:8080/players`

---

## 📦 Endpoints disponíveis

| Método | Rota             | Descrição                    |
|--------|------------------|------------------------------|
| GET    | /players         | Lista todos os jogadores     |
| GET    | /players/{id}    | Busca jogador por ID         |
| POST   | /players         | Cria um novo jogador         |
| DELETE | /players/{id}    | Remove jogador por ID        |

> A documentação ainda está em construção. O projeto será expandido.

---

## 📝 Objetivo

Este projeto serve como base para estudar e praticar tópicos como:
- Boas práticas com Spring
- Deploy com Docker

---

## 📂 Estrutura do projeto

- `src/main/java/br/com/guuirs07/players/` → código-fonte principal
- `docker-compose.yml` → orquestração do app + banco
- `Dockerfile` → build da imagem Java
- `build.gradle` → gerenciamento de dependências

---

## ✍️ Autor

Desenvolvido por [@guuirs07](https://github.com/guuirs07) — projeto pessoal de estudo com Java.