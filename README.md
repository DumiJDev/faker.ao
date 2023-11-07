# Faker.ao

## Descrição

O projeto **faker.ao** é uma biblioteca Java que permite a geração de dados falsos, mas realistas, para o preenchimento de bancos de dados, interfaces de usuário e muito mais. Esta biblioteca é especialmente útil para desenvolvedores e testadores que precisam de uma maneira rápida e fácil de gerar dados de teste.

## Pré-requisitos

Para usar esta biblioteca, você precisará ter o seguinte instalado em seu sistema:

- Java 8 ou superior
- Maven

## Instalação

Para instalar a biblioteca em seu projeto Maven, adicione a seguinte dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>io.github.dumijdev</groupId>
    <artifactId>faker.ao</artifactId>
    <version>0.0.1</version>
</dependency>
```

## Uso

Aqui está um exemplo de como você pode usar a biblioteca para gerar dados falsos:

```java
//Generate a random person
Person person = PersonUtils.generate();

//Generate a random person from a custom seed
int seed = 34;

Person personFromCustomSeed = PersonUtils.generate(seed);

//Generate a same person from a constant String name (seed)
int seed = PersonUtils.generateSeedFromPersonName("Angola");

Person personFromCustomSeed = PersonUtils.generate(seed);

//Printing person object (name, age, province)
System.out.println(person);

```

## Contribuição

Contribuições para o projeto são bem-vindas. Por favor, leia as diretrizes de contribuição antes de enviar um pull request.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para obter detalhes.