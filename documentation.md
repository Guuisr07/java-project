# 📘 Curso Java com Spring Boot – Sumário e Cronograma

## 🔹 Módulo 1 – Criação da API Base (`biblioteca-api`)

| Aula | Tema                                              | Foco Principal |
|------|---------------------------------------------------|----------------|
| 1    | Introdução ao Gradle + Spring Boot Web            | Build, plugins, anotações e actuator |
| 2    | Anotações Spring e estrutura MVC                  | Stereotypes, organização em camadas |
| 3    | Swagger e boas práticas de documentação           | SpringDoc, OpenAPI |
| 4    | Logs e métricas com Micrometer                    | Logback, traceId/spanId, métricas básicas |
| 5    | Propriedades com `@ConfigurationProperties`       | application.yml e perfis |

## 🔹 Módulo 2 – Banco de Dados e Tratamento de Erros

| Aula | Tema                                              | Foco Principal |
|------|---------------------------------------------------|----------------|
| 6    | Introdução ao JPA e Spring Data                   | Persistência, HikariCP |
| 7    | Modelagem e acesso a dados                        | Repositórios e entidades |
| 8    | Tratamento de exceções com `@ControllerAdvice`    | ApplicationException, BusinessException |
| 9    | Dicionário de erros e logs com `errorCode`        | Padrão de erro profissional |
| 10   | Introdução a testes com JUnit                     | Testes de unidade e de serviço |

## 🔹 Módulo 3 – Integrações Externas

| Aula | Tema                                              | Foco Principal |
|------|---------------------------------------------------|----------------|
| 11   | Feign Client: consumo de APIs                     | Integração HTTP |
| 12   | Resilience4j: Timeout, Retry, Fallback            | Resiliência |
| 13   | Cache com Redis via Lettuce                       | TTL, cache hit/miss, observabilidade |

## 🔹 Módulo 4 – Mensageria com SQS (`biblioteca-async`)

| Aula | Tema                                              | Foco Principal |
|------|---------------------------------------------------|----------------|
| 14   | Produção de mensagens com SNS e SQS               | Assíncrono, fanout |
| 15   | Consumo de mensagens via SQS                      | Polling, ack, DLQ, métricas |
| 16   | Organização da lógica assíncrona (modularização) | Separação entre API e async |

## 🔹 Módulo 5 – Consumo de Eventos com Kafka (`biblioteca-consumer`)

| Aula | Tema                                              | Foco Principal |
|------|---------------------------------------------------|----------------|
| 17   | Introdução ao Kafka e consumo                     | Consumer Group, offset |
| 18   | Fallback Kafka → SQS                              | Reprocessamento |
| 19   | Monitoramento e logs de eventos                   | Telemetria e rastreamento |

## 🔹 Módulo 6 – Deploy e Observabilidade

| Aula | Tema                                              | Foco Principal |
|------|---------------------------------------------------|----------------|
| 20   | Docker e empacotamento com plugin `application`   | Dockerfile para Java |
| 21   | Deploy em ECS (overview + prática)                | ECR, Service, Target Group |
| 22   | Grafana e Prometheus                              | Painéis por módulo |

## 🔹 Módulo 7 – Terraform e CI/CD

| Aula | Tema                                              | Foco Principal |
|------|---------------------------------------------------|----------------|
| 23   | Introdução ao Terraform                           | Conceitos e comandos básicos |
| 24   | Criação e importação de filas                     | Backend S3, state |
| 25   | Pipeline no Jenkins com Groovy                    | Automação de build e deploy |

## 🔹 Módulo 8 – Extras (Bônus)

| Aula | Tema                                              | Foco Principal |
|------|---------------------------------------------------|----------------|
| 26   | Integração com Splunk                             | Logs estruturados e dashboard |
| 27   | Simulação de Entrevista Técnica                   | Preparação com base no conteúdo do curso |