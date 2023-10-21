# Java RESTful API
Java RESTful API com Spring Boot 3, Java 17 e Railway baseada no lab da Digital Innovation One.

# Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class User {
        - name: String
        - email: String
        - destinations: List<Destination>
        - budget: Budget
        - expenses: List<Expense>
    }

    class Destination {
        - city: String
        - country: String
    }

    class Budget {
        - balance: Number
        - limit: Number
    }

    class Expense {
        - icon: String
        - type: String
    }

    User --> Destination
    User --> Budget
    User --> Expense

```

# Documentação da API (Swagger)

https://java-api-prd.up.railway.app/swagger-ui/index.html

*<i>Disponível no Railway por um período de tempo limitado.</i>